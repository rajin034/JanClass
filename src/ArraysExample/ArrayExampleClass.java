package ArraysExample;

import java.util.Arrays;

public class ArrayExampleClass {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0]= "john";
        names[1]= "joe";
        names[2]= "terry";
        System.out.println(names);

        int[] id = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(id));
        System.out.println(id[3]);
        for(int i=0; i<id.length;i++){
            System.out.println(id[i]);
        }
        for( int num: id){
            System.out.println(num);

        }
    }
}