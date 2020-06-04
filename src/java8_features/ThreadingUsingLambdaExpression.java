package java8_features;

public class ThreadingUsingLambdaExpression {
	
	public static void main(String[] args) {
		
		Runnable r=()->{
			
			for(int i=0;i<5;i++)
				System.out.println("Child Thread"+Thread.currentThread().getName());
		};
		Thread t=new Thread(r);
		t.setName("T1");
		t.start();
	}

}
