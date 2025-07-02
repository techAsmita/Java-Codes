//loops for,while,do-while
import java.util.Scanner;
public class Main5 {
    public static void main(String args[])
    {
        //to print numbers from one to 100
        for(int i=0;i<=100;i+=2)
        {
            System.out.println(i);
        }
        int j=1;
        while(j<=50)
        {
            System.out.println(j);
            j++;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int number=sc.nextInt();
        for(int i=0;i<number;i++)
        {
            if(number%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
        sc.close();

    }
}
