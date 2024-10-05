class demo extends Thread{
  void dis(){
    System.out.println("Running Thread1");
  }
  try {
    Thread.sleep(2000);  // Simulate time between saves
} catch (InterruptedException e) {
    System.out.println(e);
}
}

class demo2 extends Thread{
    void show(){
        System.out.println("Show ");
    }
}

public class Thread {
    
}
