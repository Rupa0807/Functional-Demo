package Employee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadImpl extends Thread{

	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try{Thread.sleep(100);}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
		
		public static void main(String[] args) throws InterruptedException {
			
		Thread t1=new Thread(new ThreadImpl());
			t1.start();
			
			try {
				t1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Runnable r= new Runnable() {

					public void run() {
					for(int i=64;i<74;i++) {
						System.out.println((char)(i));
						try{Thread.sleep(100);}
						catch(Exception e) {
							e.printStackTrace();
						}
					
				}
				
			}};
			System.out.println("*********************** Runnable Thread*****************");	
		Thread t2= new Thread(r);		
		( t2).start();
		t2.join();
		System.out.println("*********************** executor service Thread*****************");	
		   ExecutorService executorService = Executors.newFixedThreadPool(10);  
		   executorService.awaitTermination(MAX_PRIORITY,TimeUnit.MILLISECONDS);
	        executorService.execute(new Runnable() {  
	              
	            @Override  
	            public void run() {  
	                System.out.println("ExecutorService");  
	                  
	            }  
	        });  

	

}}