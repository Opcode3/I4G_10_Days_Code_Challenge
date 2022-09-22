public class Day2 {
    /**
     Task No: 2
     By: Joseph Emmanuel Emeka
     Date: 22-9-2022
     */

    public static void main(String[] args) {
        int[] example_0 = {3,2,2,3};
        int[] example_1 = {0,1,2,2,3,0,4,2};

        int k = removeElement(example_1, 2);
        Print.array(example_1);
        System.out.println("The value for K: "+k);
    }

    private static int removeElement(int[] nums, int val){
        int nullValue = 101;
        int numLen = nums.length;
        int nextIndex = 0;
        int k = numLen;
        for(int m = 0; m < numLen; m++){
            int indexValue = nums[m];
            nums[m] = nullValue;
            if(indexValue == val){
                nums[m] = nullValue;
                k--;
            }else nums[nextIndex++] = indexValue;
        }
        return k;
    }
}
