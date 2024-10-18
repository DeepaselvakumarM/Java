// class demo extends Thread{
//   void dis(){
//     System.out.println("Running Thread1");
//   }
//   try {
//     Thread.sleep(2000);  // Simulate time between saves
// } catch (InterruptedException e) {
//     System.out.println(e);
// }
// }

// class demo2 extends Thread{
//     void show(){
//         System.out.println("Show ");
//     }
// }

// public class Thread {
    
// }



class A implements Runnable{
 
 public void run(){
    for(int i=1;i<=5;i++){
      System.out.println(i);

    }
  }

}

class B implements Runnable {
  public void run() {
      try {
          for (int i = 6; i <= 10; i++) {
              System.out.println(i);
              Thread.sleep(100); // Sleep to simulate some work being done
          }
      } catch (InterruptedException e) {
          System.out.println("Thread B was interrupt.");
      }
  }
}


public class Threads{

  public static void main(String[] args) {
      A a=new A();
      B b=new B();
      Thread t1=new Thread(a);
      Thread t2=new Thread(b);
      t1.start();
      t2.start();
      try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        System.out.println("Main thread was interrupted.");
    }


  }

}