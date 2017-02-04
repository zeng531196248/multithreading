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
 *����1����׼�߳���
 *����2������߳���
 *����3�Ͳ���4����ʱ���͵�λ���������ʱ�佫�ᱻ���
 *����5�����У����߳���������ʱ�򡣾ͻὫrunable�����е�����������ӵ������н����Ŷ�
 *������Ϊ���LinkedBlockingDeque���������޶��У����Գ�ʱ�����������Ҳû��ʲô��˼�ˣ�
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
		//ʹ�ö��� SynchronousQueue
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 2, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		executor.execute(runnable);//1
		executor.execute(runnable);//2
		executor.execute(runnable);//3
		executor.execute(runnable);//4
		executor.execute(runnable);//5
		executor.execute(runnable);//6
		executor.execute(runnable);//7
		executor.execute(runnable);//8,�����߳���������߳���һ��������ʵ���߳���ʱ������
	
		Thread.sleep(1000);
		
		System.out.println("A"+executor.getCorePoolSize());//��׼����
		System.out.println("A"+executor.getMaximumPoolSize());//�������
		System.out.println("A"+executor.getPoolSize());//���������ض�����
		System.out.println("A"+executor.getQueue().size());//��չ��������
		Thread.sleep(1000);
		System.out.println("B"+executor.getCorePoolSize());//��׼����
		System.out.println("b"+executor.getMaximumPoolSize());//�������
		System.out.println("b"+executor.getPoolSize());//���������ض�����
		System.out.println("b"+executor.getQueue().size());//��չ��������
		
		
		
		
	}
	
	
	
	
	
}
