// more operators

class Main3 {
    public static void main(String args[]){
        float f1= 31.5f + 1.5f;
        System.out.println("The ouput is: " +f1);
        String s="Asmita" + " Roy";
        System.out.println("The ouput is: " +s);
        boolean b=1<4;
        System.out.println("The value is: " +b);
        boolean d= 9 == 9;
        System.out.println("The value is: " +d);
        boolean perftA = 7>=9;
        boolean perftB = 9<=10;
        boolean res = perftA || perftB;
        boolean res2 = perftA && perftB;
        System.out.println("The value is: " +res+ " " +res2);
        System.out.println("The area of circle is: " +areacircle(6));
    }
    static float areacircle(int r)
    {
        float pi=3.14f;
        float area= pi*r*r;
        return Math.round(area*100)/100.0f;
    }
    // types of logical operators
    // and &&, or || ad not !.
}
