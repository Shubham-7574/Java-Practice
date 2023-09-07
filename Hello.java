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
        System.out.println(num1+num2);
    }
}
