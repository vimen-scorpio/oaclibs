package com.st.oac.stthreadpoollib.deliver;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: AndroidDeliver
 * @Description:
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:21
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public final class AndroidDeliver implements Executor {

    private static AndroidDeliver instance = new AndroidDeliver();
    private Handler main = new Handler(Looper.getMainLooper());

    public static AndroidDeliver getInstance() {
        return instance;
    }

    @Override
    public void execute(final Runnable runnable) {
        //返回应用程序的looper，它位于应用程序的主线程中。
        Looper mainLooper = Looper.getMainLooper();
        //如果当前looper就是当前主线程，那么调用run后不再执行下面的语句
        if (Looper.myLooper() == mainLooper) {
            runnable.run();
            return;
        }

        //开启子线程
        main.post(new Runnable() {
            @Override
            public void run() {
                //注意：这里需要增加非空判断
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }
}

