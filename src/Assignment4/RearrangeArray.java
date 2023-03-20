package Assignment4;


import java.util.HashSet;
import java.util.Set;

public class RearrangeArray {
    int[] num = {0, 2, 1, 5, 3, 4};
    int[] nums={5,0,1,2,3,4};

    int length = num.length;
    int[] a = new int[length];
    int l=nums.length;
    int[] b=new int[l];

    public void array(){

        for(int i = 0; i <= length - 1; i++) {
            a[i] = num[num[i]];
        }

        System.out.print("Input Nums = [ ");
        for(int j = 0; j <= length - 1; j++) {
            System.out.print(num[j] + "," + " ");
        }
        System.out.println("]");

        System.out.print("Output : [ ");
        for(int k = 0; k <= length - 1; k++) {
            System.out.print(a[k] + "," + " ");
        }
        System.out.print("]");
    }
    public void array2(){
        for(int i = 0; i <= l - 1; i++) {
            b[i] = nums[nums[i]];
        }

        System.out.print("Another Input Nums = [ ");
        for(int j = 0; j <= l - 1; j++) {
            System.out.print(nums[j] + "," + " ");
        }
        System.out.println("]");

        System.out.print("Another Output : [ ");
        for(int k = 0; k <= l - 1; k++) {
            System.out.print(b[k] + "," + " ");
        }
        System.out.print("]");
    }

}
