//conditional statements.
import java.util.Scanner;
public class Main4 {
    public static void main(String args[]){
        System.out.println("Hello Bharat!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your battery percentage: ");
        int percentagebat= sc.nextInt();
        if(percentagebat>=50)
        {
            System.out.println("Your phone has good battery life.");
        }
        else if(percentagebat<50)
        {
            System.out.println("You need to charge your battery quickly.");
        }
        else
        {
            System.out.println("Invalid try again");
        }

        //practice of switch case
        int a=30;
        float b=25.57f;
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            if(b!=0)
            {
                System.out.println(a/b);
            }
            else
            {
                System.out.println("Not possible by zero division.");
            }
            break;
            default:
            System.out.println("Error!!!");
            break;
        }
    sc.close();
    }
}
