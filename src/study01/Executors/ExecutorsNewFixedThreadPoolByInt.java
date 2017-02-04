package study01.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Administrator
 *有限的线程
 *
 *
 *
 *
 *Runable===A== begin==========1486214452145ThreadNamepool-1-thread-1
Runable===A== begin==========1486214452145ThreadNamepool-1-thread-3
Runable===A== begin==========1486214452145ThreadNamepool-1-thread-2
A
Runable end=======1486214453145ThreadNamepool-1-thread-3
Runable===A== begin==========1486214453145ThreadNamepool-1-thread-3
A
Runable end=======1486214453145ThreadNamepool-1-thread-2
Runable===A== begin==========1486214453145ThreadNamepool-1-thread-2
A
Runable end=======1486214453145ThreadNamepool-1-thread-1
Runable===A== begin==========1486214453145ThreadNamepool-1-thread-1
A
Runable end=======1486214454145ThreadNamepool-1-thread-1
Runable===A== begin==========1486214454145ThreadNamepool-1-thread-1

 *可以发先不管你循环多少次，都只有三个线程
 *
 *API：newFixedThreadpool(int i);//自定义大小的线程池
 *
 */                                
public class ExecutorsNewFixedThreadPoolByInt {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
	for (int i = 0; i < 10; i++) {
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable===A== begin=========="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
					System.out.println("A");
					System.out.println("Runable end======="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
	}
		
	}
	
}
