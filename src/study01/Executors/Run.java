package study01.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * ThreadName==============----����Zr���Ƶ�С�߳�----
 * @author Administrator
 *
 */
public class Run {
public static void main(String[] args) {
	ExecutorsNewCachedThreadPoolByThreadFactory threadFactory=new ExecutorsNewCachedThreadPoolByThreadFactory();
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool(threadFactory);
		cachedThreadPool.execute(new Runnable() {
			@Override
			public void run() {
				System.err.println("ThreadName=============="+Thread.currentThread().getName());				
			}
		});
	
}
}
