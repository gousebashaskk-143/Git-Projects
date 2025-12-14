import java.util.Scanner;
class EvenOdd{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr a Number please: ");
    
    int num = sc.nextInt();
    
   /*  if(num % 2==0){
        System.out.println("Even Number");

    }else{
        System.out.println("Odd Number");
    }   */

        for (int i=2; i<=num; i+=2){ //for odd  for (int i=1; i<=num; i+=2){
            if (i % 2==0)
            System.out.println(i + "Even");
         else
            System.out.println(i + "Odd");
        }

            
        }
}
