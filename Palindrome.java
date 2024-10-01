
import java.util.Scanner;

// class Calculator{
//     void add(int a,int b){
//         System.out.println(a+b);
//     }
//     void  add(double a ,double b){
//         System.out.println(a+b);
//     }
//     void  add(float a,float b){
//         System.out.println(a+b);
//     }
// }

// public  class Pol{
//     public static void main(String[] args) {
//         Calculator c=new Calculator();
//         c.add(12, 12);
//         c.add(12.1, 12.1);
//         c.add(12.3, 12.3);
//     }
// }

// class Shape{
//     final String s="Hello";
//     void calculateArea(){
//         System.out.println("You can extend the shae");
//         System.out.println(s);

//     }
// }
// class Circle extends Shape{
//     void calculateArea(){
//         System.out.println("The shape  is circle");
//         super.calculateArea();
//     }
// }

// class Rectangle extends Shape{
//     void calculateArea(){
//         System.out.println("The shape  is rectangle");
//     }
// }

// class Triangle extends Shape{
//     void calculateArea(){
//         System.out.println("The shape  is triangle");
//     }
// }

// public class Pol {

//     public static void main(String[] args) {
//         Shape s=new Shape();
//         Shape s1=new Circle();
//         s1.calculateArea();
//         s.calculateArea();

//     }
// }

/**
 * Pol
 */
// public class  Fib{

//     public static void main(String[] args) {
//         int n1=0,n2=1,n3,c=10;
//         System.out.println(n1+""+n2);
//         for(int i=2;i<c;++i){
//             n3=n1+n2;
//             System.out.print(""+n3);
//             n1=n2;
//             n2=n3;
//         }
        
//     }
    
// }

//  public class Prime{
//     public static void main(String[] args) {
//         int i,m=0,flag=0;
//         int n=3;
//         m=n/2;
//         if(n==0||n==1){
//             System.out.println("not prime number");
//         }
//         else{
//             for(i=2;i<=m;i++){
//                 if(n%i==0){
//                     System.out.println("not prime number");
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)  { System.out.println(n+" is prime number"); }  
//         }
//         }
//     }
public class Palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String or=s.nextLine();
        String str=or.replaceAll("\\s","").toLowerCase();
        String reverse="";
        

    }
}