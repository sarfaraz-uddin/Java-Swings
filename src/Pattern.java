public class Pattern {
    int i;
    int j;
    public void firstpattern(){
        for(i=1; i<=5; i++){
            for(j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void secondpattern(){
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void thirdpattern(){
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
