public class Person {
    String name;
    int age;

    Person(){
        name="Sarfaraz";
        age=25;
    }
    Person(String a,int b){
        name=a;
        age=b;
    }
    public void introduce(){
        System.out.println("hi,my name is " + name + " and I am " + age + " years old.");
    }
}
