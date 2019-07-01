package com.st.oac.stthreadpoollib.callback;

import java.util.concurrent.Executor;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: NormalCallback
 * @Description: 回调委托类，监听
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:17
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public final class NormalCallback implements ThreadCallback, AsyncCallback {


    private ThreadCallback callback;
    private AsyncCallback async;
    private Executor deliver;

    public NormalCallback(ThreadCallback callback, Executor deliver, AsyncCallback async) {
        this.callback = callback;
        this.deliver = deliver;
        this.async = async;
    }

    /**
     * 回调成功
     *
     * @param o
     */
    @Override
    public void onSuccess(final Object o) {
        if (async == null) {
            return;
        }
        deliver.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    //noinspection unchecked
                    async.onSuccess(o);
                } catch (Throwable t) {
                    onFailed(t);
                }
            }
        });
    }

    /**
     * 回调失败
     *
     * @param t 异常
     */
    @Override
    public void onFailed(final Throwable t) {
        if (async == null) {
            return;
        }
        deliver.execute(new Runnable() {
            @Override
            public void run() {
                async.onFailed(t);
            }
        });
    }

    /**
     * 回调异常
     *
     * @param name 线程name
     * @param t    异常
     */
    @Override
    public void onError(final String name, final Throwable t) {
        onFailed(t);
        if (callback == null) {
            return;
        }
        deliver.execute(new Runnable() {
            @Override
            public void run() {
                callback.onError(name, t);
            }
        });
    }

    /**
     * 回调完成
     *
     * @param name 线程name
     */
    @Override
    public void onCompleted(final String name) {
        if (callback == null) {
            return;
        }
        deliver.execute(new Runnable() {
            @Override
            public void run() {
                callback.onCompleted(name);
            }
        });
    }

    /**
     * 回调开始
     *
     * @param name 线程name
     */
    @Override
    public void onStart(final String name) {
        if (callback == null) {
            return;
        }
        deliver.execute(new Runnable() {
            @Override
            public void run() {
                callback.onStart(name);
            }
        });
    }
}

