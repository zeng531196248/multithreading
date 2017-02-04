package study01.Executors;

import java.util.concurrent.ThreadFactory;

/**
 * 
 * @author Administrator
 *定制线程   
 */
public class ExecutorsNewCachedThreadPoolByThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
	Thread thread= new Thread(r);
	thread.setName("----我是Zr定制的小线程----"+Math.random());
		return thread;
	}
	
	
}




