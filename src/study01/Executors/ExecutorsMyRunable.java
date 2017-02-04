package study01.Executors;
   class ExecutorsMyRunable  implements Runnable{

	private String username;
	
	public ExecutorsMyRunable( String username) {
		super();
		this.username=username;
		
	}
	
	@Override
	public void run() {
		System.out.println("username====="+username+"MyRunable---begin"+System.currentTimeMillis()+"ThradName==="+Thread.currentThread().getName());
		System.out.println("username====="+username+"MyRunable---end"+System.currentTimeMillis()+"ThradName==="+Thread.currentThread().getName());
		
	}

	
	
		
		
		

	
}
