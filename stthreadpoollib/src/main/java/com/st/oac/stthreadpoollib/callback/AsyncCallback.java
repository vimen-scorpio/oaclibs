package com.st.oac.stthreadpoollib.callback;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: AsyncCallback
 * @Description: 异步callback回调接口
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:15
 * @Version: Ver1.1.0
 * *********************************************************************
 */

public interface AsyncCallback<T> {

    /**
     * 成功时调用
     *
     * @param t 泛型
     */
    void onSuccess(T t);

    /**
     * 异常时调用
     *
     * @param t 异常
     */
    void onFailed(Throwable t);


    /**
     * 通知用户任务开始运行
     *
     * @param threadName 正在运行线程的名字
     */
    void onStart(String threadName);

}
