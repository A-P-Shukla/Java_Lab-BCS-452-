public class ThreadExample implements Runnable { 
public void run() { 
System.out.println("Thread is running..."); 
} 
public static void main(String[] args) { 
try { 
int a = 5 / 0; 
} catch (ArithmeticException e) { 
System.out.println("Arithmetic Exception caught."); 
} finally { 
System.out.println("Finally block executed."); 
} 
Thread t1 = new Thread(new ThreadExample()); 
Thread t2 = new Thread(new ThreadExample()); 
t1.start(); 
t2.start(); 
} 
} 
