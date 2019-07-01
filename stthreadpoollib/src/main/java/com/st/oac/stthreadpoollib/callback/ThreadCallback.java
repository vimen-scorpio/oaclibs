package com.st.oac.stthreadpoollib.callback;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: ThreadCallback
 * @Description:一个回调接口，用于通知用户任务的状态回调委托类。线程的名字可以自定义
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:16
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public interface ThreadCallback {
    /**
     * 当线程发生错误时，将调用此方法。
     *
     * @param threadName 正在运行线程的名字
     * @param t          异常
     */
    void onError(String threadName, Throwable t);

    /**
     * 通知用户知道它已经完成
     *
     * @param threadName 正在运行线程的名字
     */
    void onCompleted(String threadName);

    /**
     * 通知用户任务开始运行
     *
     * @param threadName 正在运行线程的名字
     */
    void onStart(String threadName);


}
