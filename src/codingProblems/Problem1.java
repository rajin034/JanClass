package codingProblems;

import java.util.Arrays;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int [] arr=new int[2];
        for(int i=0;i<(nums.length-1);i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;

                }
            }
        }
        return arr;


    }


    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int[] input = new int[]{1,3,2,4,5,6,7,8};
        int target = 15;
        System.out.println(Arrays.toString(p.twoSum(input, target)));
    }
}
