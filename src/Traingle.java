public class Traingle {
    int sidea;
    int sideb;
    int sidec;
    Traingle(int a,int b,int c){
        sidea=a;
        sideb=b;
        sidec=c;
    }
    void train(){
        int area=(sideb*sidec)/2;
        int perimeter=sidea+sideb+sidec;
        System.out.println("the area of the traingle is " + area + ".");
        System.out.println("the perimeter of the traingle is " + perimeter + ".");

    }
}
