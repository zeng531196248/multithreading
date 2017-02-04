package study01.Executors;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Administrator
 *	Api: ThreadPoolExecutor
 *	
 *	ThreadName====pool-1-thread-3
	ThreadName====pool-1-thread-6
	ThreadName====pool-1-thread-7
	ThreadName====pool-1-thread-2
	ThreadName====pool-1-thread-4
	ThreadName====pool-1-thread-5
	ThreadName====pool-1-thread-1
	A7
	A8
	A7
	A0
	B7
	b8
	b7
	b0
 *new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
 *参数1：标准线程数
 *参数2：最大线程数
 *参数3和参数4：超时数和单位：超过这个时间将会被清除
 *参数5：队列；当线程数不够用时候。就会将runable中运行的任务多余的添加到队列中进行排队
 *那是因为这个LinkedBlockingDeque对列是无限对列，所以超时的这个在这里也没有什么意思了！
 *
 *
 */
public class ExecutorsByThreadPoolExector {

	public static void main(String[] args) throws Exception {
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ThreadName===="+Thread.currentThread()
						.getName());
			}
		};
		
	//	ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		//使用对列 SynchronousQueue
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 2, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		executor.execute(runnable);//1
		executor.execute(runnable);//2
		executor.execute(runnable);//3
		executor.execute(runnable);//4
		executor.execute(runnable);//5
		executor.execute(runnable);//6
		executor.execute(runnable);//7
		executor.execute(runnable);//8,测试线程数和最大线程数一样，大于实际线程数时候的情况
	
		Thread.sleep(1000);
		
		System.out.println("A"+executor.getCorePoolSize());//标准人数
		System.out.println("A"+executor.getMaximumPoolSize());//最大人数
		System.out.println("A"+executor.getPoolSize());//车子中正载多少人
		System.out.println("A"+executor.getQueue().size());//扩展车中人数
		Thread.sleep(1000);
		System.out.println("B"+executor.getCorePoolSize());//标准人数
		System.out.println("b"+executor.getMaximumPoolSize());//最大人数
		System.out.println("b"+executor.getPoolSize());//车子中正载多少人
		System.out.println("b"+executor.getQueue().size());//扩展车中人数
		
		
		
		
	}
	
	
	
	
	
}
