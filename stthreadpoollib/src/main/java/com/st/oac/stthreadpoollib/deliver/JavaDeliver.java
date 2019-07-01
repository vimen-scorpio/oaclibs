package com.st.oac.stthreadpoollib.deliver;

import androidx.annotation.NonNull;

import java.util.concurrent.Executor;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: JavaDeliver
 * @Description: 默认情况下，用于Java平台的交付
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:22
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public final class JavaDeliver implements Executor {

    private static JavaDeliver instance = new JavaDeliver();

    public static JavaDeliver getInstance() {
        return instance;
    }

    /**
     * 注意增加非空判断
     * @param runnable              runnable
     */
    @Override
    public void execute(@NonNull Runnable runnable) {
        runnable.run();
    }


}