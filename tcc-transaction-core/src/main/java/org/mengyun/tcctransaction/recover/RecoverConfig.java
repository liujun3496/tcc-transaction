package org.mengyun.tcctransaction.recover;

import java.util.Set;

/**
 * Created by changming.xie on 6/1/16.
 */
public interface RecoverConfig {

    /**
     * 最大重试次数
     * @return
     */
    public int getMaxRetryCount();

    /**
     * 恢复间隔时间
     * @return
     */
    public int getRecoverDuration();

    /**
     * Cron表达式
     * @return
     */
    public String getCronExpression();

    /**
     * 延迟取消异常集合
     * @return
     */
    public Set<Class<? extends Exception>> getDelayCancelExceptions();

    /**
     * 设置延迟取消异常集合
     * @param delayRecoverExceptions
     */
    public void setDelayCancelExceptions(Set<Class<? extends Exception>> delayRecoverExceptions);

    public int getAsyncTerminateThreadPoolSize();
}
