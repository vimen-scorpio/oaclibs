package com.st.oac.stthreadpoollib.factory;

import androidx.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: MyThreadFactory
 * @Description: 默认Thread工厂
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:35
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public class MyThreadFactory implements ThreadFactory {

    private int priority;
    public MyThreadFactory(int priority) {
        this.priority = priority;
    }


    @Override
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(priority);
        return thread;
    }

}

