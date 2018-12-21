package com.snowcattle.future;

/**
 * Created by jiangwenping on 16/12/27.
 */
public interface ITaskFutureListener<V extends ITaskFuture<?>> extends EventListener {

	/**
	 * 完成
	 */
	void operationComplete(ITaskFuture<V> future) throws Exception;
}
