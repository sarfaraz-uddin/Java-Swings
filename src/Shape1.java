import java.sql.SQLOutput;

public class Shape1 {
    public int width = 10;
    public int height = 20;

    // public int area= width*height;
    //default constructor
    Shape1(int w, int h) {
        width = w;
        height = h;
    }

    public void area1() {
        int area = width * height;
        System.out.println(" area from shape is " + area);

    }
}
