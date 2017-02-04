package study01.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author zr
 *
 *@result
 *	Runable===A== begin==========1486211765428ThreadNamepool-1-thread-1
	Runable==B=== begin==========1486211765428ThreadNamepool-1-thread-2
	B
	A
	Runable end=======1486211766428
	Runable end=======1486211766428

 * ͨ�������Ľ�����Է���newCacherThreadPool�����һ�������̵߳ĳ�
 * ��һ����û�����Ƶ��̳߳أ�
 *
 *
 */
public class ExecutorsNewCachedThreadPool {

	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable===A== begin=========="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
					System.out.println("A");
					System.out.println("Runable end======="+System.currentTimeMillis());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable==B=== begin=========="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
					System.out.println("B");
					System.out.println("Runable end======="+System.currentTimeMillis());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
	}
	
}
