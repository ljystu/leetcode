import java.io.PrintWriter;
import java.util.Arrays;

public class largestSumAfterKNegations_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[][] sorted_nums=new int [nums.length][2];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sorted_nums[i][0]=nums[i];
            sorted_nums[i][1]=i;
            sum+=nums[i];
        }
        Arrays.sort(sorted_nums,(a, b)->a[0]-b[0]);
        int i=0;
        while(k>0&&i<nums.length){
            if(nums[sorted_nums[i][1]]==0)
                return sum;
            else if(nums[sorted_nums[i][1]]<0){
                nums[sorted_nums[i][1]]= 0-nums[sorted_nums[i][1]];
                sorted_nums[i][0]=-sorted_nums[i][0];
                sum+= 2*nums[sorted_nums[i][1]];
            }
            else{
                break;
            }
            k--;
            i++;
        }
        Arrays.sort(sorted_nums,(a,b)->a[0]-b[0]);
        k=k%2;
        if(k==1){
            sum-= 2*nums[sorted_nums[0][1]];}

        return sum;
    }

    public static void main(String[] args) {
        largestSumAfterKNegations_1005 largestSumAfterKNegations_1005=new largestSumAfterKNegations_1005();
        System.out.println(largestSumAfterKNegations_1005.largestSumAfterKNegations(new int[]{-4,-2,-3},        4));
    }
}
