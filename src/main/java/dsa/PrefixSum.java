package dsa;

public class PrefixSum {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,4};
        removeDuplicate(nums);
    }

    public static void removeDuplicate(int[] nums){
        int write = 1;
        for(int read =0;read < nums.length-1; read++){
            if(nums[read]!=nums[read+1]){
                nums[write++] = nums[read];
            }
        }
        System.out.println(nums);
        System.out.println(write);
    }
}
