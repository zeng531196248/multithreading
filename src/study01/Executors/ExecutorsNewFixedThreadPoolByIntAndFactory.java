package study01.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
      /**
       *	Runable===A== begin==========1486215276246ThreadName----����Zr���Ƶ�С�߳�----0.48483642565418716
			Runable===A== begin==========1486215276246ThreadName----����Zr���Ƶ�С�߳�----0.9608880639295031
			A
			A
			Runable end=======1486215277246ThreadName----����Zr���Ƶ�С�߳�----0.9608880639295031
			Runable end=======1486215277246ThreadName----����Zr���Ƶ�С�߳�----0.48483642565418716
			Runable===A== begin==========1486215277246ThreadName----����Zr���Ƶ�С�߳�----0.48483642565418716
			A
			Runable end=======1486215278246ThreadName----����Zr���Ƶ�С�߳�----0.48483642565418716                       
			       * @author Administrator
			       * 
			       * 
			       * ���Կ�����ʱ�õ��̶߳��Ƕ��Ƶ��̺߳��н���߳�
       *
       */
public class ExecutorsNewFixedThreadPoolByIntAndFactory {
	
	public static void main(String[] args) {
		ExecutorsNewCachedThreadPoolByThreadFactory factory=new ExecutorsNewCachedThreadPoolByThreadFactory();
		ExecutorService executorService = Executors.newFixedThreadPool(2,factory);
	for (int i = 0; i < 3; i++) {
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
	
