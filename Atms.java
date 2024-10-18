
import java.util.Scanner;



public class Atms {
    public static void main(String[] args) {
        int pin=1234;
        int balance=100;
        int add=0;
        int take=0;
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter pin number");
        int pass=s.nextInt();
        if (pass==pin){
            System.out.println("Enter name");
            name=s.next();
            System.out.println("welcome "+name);
            while (true) {
                System.out.println("Press 1 to checkbalance"); 
                System.out.println("Press 2 to add amount"); 
                System.out.println("press 3 to take amount"); 
                System.out.println("press 4 to take recipt"); 
                System.out.println("press 5 to exit"); 
                
                int opt=s.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your balance "+balance);
                        break;
                    case 2:
                    System.out.println("Add the depposit amount");
                    add=s.nextInt();
                    System.out.println("sucessfully credited");
                    balance=add+balance;
                    break;
                    case 3:
                    System.out.println("withdraw the depposit amount");
                    take=s.nextInt();
                    if(take<balance){
                    System.out.println("Your are deposited");
                    }
                    else{
                        System.out.println("Deposited");
                        balance=balance-take;
                    }
                    break;
                    case 4:
                    System.out.println("your receipt uptodate"+balance);
                    break;
                    case 5:
                    System.out.println("Thank you for Using our services");
                    break;
                    default:
                        break;
                }
                
            }
        }
    }
}
