package study01.Executors;

import java.util.concurrent.ThreadFactory;

/**
 * 
 * @author Administrator
 *�����߳�   
 */
public class ExecutorsNewCachedThreadPoolByThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
	Thread thread= new Thread(r);
	thread.setName("----����Zr���Ƶ�С�߳�----"+Math.random());
		return thread;
	}
	
	
}




