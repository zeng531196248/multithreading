package study01.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * username=====2MyRunable---begin1486213038067ThradName===pool-1-thread-2
 
username=====5MyRunable---begin1486213038068ThradName===pool-1-thread-5
username=====3MyRunable---begin1486213038067ThradName===pool-1-thread-3
username=====1MyRunable---begin1486213038067ThradName===pool-1-thread-1
username=====1MyRunable---end1486213038068ThradName===pool-1-thread-1
username=====4MyRunable---begin1486213038068ThradName===pool-1-thread-4
username=====3MyRunable---end1486213038068ThradName===pool-1-thread-3
username=====5MyRunable---end1486213038068ThradName===pool-1-thread-5
 
username=====2MyRunable---end1486213038068ThradName===pool-1-thread-2
username=====4MyRunable---end1486213038069ThradName===pool-1-thread-4
username=====1MyRunable---begin1486213039069ThradName===pool-1-thread-4
username=====1MyRunable---end1486213039070ThradName===pool-1-thread-4
username=====3MyRunable---begin1486213039069ThradName===pool-1-thread-5
username=====5MyRunable---begin1486213039069ThradName===pool-1-thread-1
username=====3MyRunable---end1486213039070ThradName===pool-1-thread-5
username=====4MyRunable---begin1486213039069ThradName===pool-1-thread-3
username=====4MyRunable---end1486213039071ThradName===pool-1-thread-3
username=====2MyRunable---begin1486213039069ThradName===pool-1-thread-2
username=====2MyRunable---end1486213039071ThradName===pool-1-thread-2
username=====5MyRunable---end1486213039070ThradName===pool-1-thread-1

 * @author Administrator
 *
 *
 *
 *@result
 *上述线程2可以发现线程的复用性，出现了相同的
 */

public class ExecutorsMyRunableMain {

	public static void main(String[] args) throws InterruptedException {
		
			ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
	for (int j = 0; j < 5; j++) {
		cachedThreadPool.execute(new ExecutorsMyRunable(""+(j+1)));
		
	}		
	
	System.out.println(" ");
	System.out.println(" ");
	Thread.sleep(1000);
	for (int j = 0; j < 5; j++) {
		cachedThreadPool.execute(new ExecutorsMyRunable(""+(j+1)));
		
	}	
	
	}
}
