import java.util.List;

public class Day1 {
    public static void main(String[] args) {

        int[] example_0 = {1,1,2};
        int[] example_1 = {0,0,1,1,1,2,2,3,3,4};
        int[] example_2 = {1,2};
        int[] example_3 = {1,2,2};

        int k = removeDuplicate(example_1);
        System.out.println("Printing all the array values: "+k);

        arrayPrintOut(example_1);

    }

    private static int removeDuplicate(int[] nums){
        int k = 1;
        int indexValue = nums[0];
        int nullValue = 101;
        int nextIndex = 1;
        for(int i = 1; i < nums.length; i++){
            int currentValue = nums[i];
            nums[i] = nullValue;
            if(indexValue != currentValue){
                nums[nextIndex] = currentValue;
                indexValue = currentValue;
                nextIndex++;
                k++;
            }
        }
        return k;
    }

    private static void arrayPrintOut(int[] nums){
        for(int num : nums){
            System.out.println(num+" ");
        }
    }
}
