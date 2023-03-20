package Interface;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");
        Cat cat=new Cat("Golden","Savannah","big");
        cat.getColor();
        cat.getBreed();
        cat.getSize();
    }
}
