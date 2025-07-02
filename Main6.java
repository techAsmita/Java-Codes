// arrays ds

public class Main6 {
    public static void main(String args[])
    {
        System.out.println("Hello world");
        System.out.println("Hello Bharat");
        //defining arrays.
        // sizeof function doesn't work in java in java 
        // we use array name with length function.
        int[] marksarr={23,25,29,30,31,100,90,1002};
        int size=marksarr.length;
        System.out.println(marksarr[4]);
        System.out.println("\n");
        for(int i=0;i<size;i++)
        {
            System.out.println(marksarr[i]);
        }
        // we can change the value of array.
        marksarr[0]=100;
        System.out.println(marksarr[0]);
        System.out.println(marksarr.length);
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(marksarr[i]);
        }
        // < size, <= size-1;
        // int sum=0;
        // for(int i=0;i<size;i++)
        // {
        //     sum=sum+marksarr[i];
        //     System.out.println(sum);
        // }
    }
}
