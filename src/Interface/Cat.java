package Interface;

public class Cat implements Animal,AnotherAnimal{
    String color;
    String breed;
    String size;

    Cat(String a,String b,String c){
        color=a;
        breed=b;
        size=c;

    }
    public void getColor(){
        System.out.println("The color is " + color);
    }
    public void getBreed(){
        System.out.println("The breed is " + breed);
    }
    public void getSize(){
        System.out.println("The size is " + size);
    }
}
