package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws Exception {
        int divider=0;
        int value=500;
        if(divider==0) {
            throw new Exception("divided by number 0");
        }
        int result=value/divider;
        System.out.println("Result is " + result);

//        try{
//            int divider=0;
//            int value=500;
//            int result=value/divider;
//            System.out.println("Result is " + result);
//        }catch(ArithmeticException e){
//            System.out.println("la hai kina 0 deko");
//        }finally {
//            System.out.println("this is finally");
//        }


        anotherWork();
        anotherWork();
    }

    static void anotherWork(){
        System.out.println("anotherwork");
    }
}
