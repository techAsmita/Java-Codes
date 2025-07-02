//basics of java

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int a = sc.nextInt();
        // System.out.println("You entered: " + a);
        // sc.close(); // Do not close Scanner here if you need to use System.in again
        System.out.println(2+4);
        // System.out.println("Enter the values of c and d:");
        // int c = sc.nextInt();
        // float d = sc.nextFloat();
        // System.out.println("You entered c:" +c+ " and d:" +d);
        sc.close(); // Close Scanner at the end
        String name="Asmita";
        System.out.println("My name is: " +name);
        System.out.println("Hello World");
        System.out.println(5*8);
        System.out.println(3+9);
        System.out.println(50-8);
        System.out.println(600/40);
        boolean happy=true;
        System.out.println(happy);
        String animalname="Lion";
        System.out.println("The name of animal is:" +animalname);
    }
}