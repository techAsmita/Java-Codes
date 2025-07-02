//functions
// necessary to call the function
class Main2 {
    static void SayHello(){
        System.out.print("Say hello to everyone!");
    }
    public static void main(String args[]){
        SayHello();
        System.out.println(); //in c++ we write cout<<endl;
        int areaR=areaofrect(5, 6);
        System.out.println("The area of rectangle is: " +areaR);
        System.out.println(areaofrect(20, 30));
        int areaofsquare=areasq(5);
        System.out.println("The area of square is: " +areaofsquare);
    }

    static int areaofrect(int l, int b){
        int area=l*b;
        return area;
    }
    static int areasq(int side){
        int res=side*side;
        return res;
    }
}
