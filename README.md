# Java-Practice
import java.util.Scanner;

class Hello
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1=sc.nextInt();
        System.out.println("Enter second no.");
        int num2=sc.nextInt();
        int result= num1+num2;
        System.out.println( "result = "+result);
    }
}
