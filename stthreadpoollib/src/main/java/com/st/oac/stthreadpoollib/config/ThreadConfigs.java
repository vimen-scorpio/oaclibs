package com.st.oac.stthreadpoollib.config;

import java.util.concurrent.Executor;

import com.st.oac.stthreadpoollib.callback.AsyncCallback;
import com.st.oac.stthreadpoollib.callback.ThreadCallback;

/**
 * *********************************************************************
 *
 * @Copyright (C), 2019, 重庆赛赢赛特科技有限公司
 * @ProjectName: wxyLibs
 * @ClassName: ThreadConfigs
 * @Description:存储当前任务的某些配置
 * @Author: Scorpio_wxy
 * @Tel: 13996304591
 * @CreateDate: 2019-07-01 11:19
 * @Version: Ver1.1.0
 * *********************************************************************
 */
public final class ThreadConfigs {

    /**
     * 线程的名称
     * 通过setName方法设置
     */
    public String name;
    /**
     * 线程执行延迟的时间
     * 通过setDelay方法设置
     */
    public long delay;
    /**
     * 线程执行者
     * JAVA或者ANDROID
     */
    public Executor deliver;
    /**
     * 用户任务的状态回调callback
     */
    public ThreadCallback callback;
    /**
     * 异步callback回调callback
     */
    public AsyncCallback asyncCallback;

}

