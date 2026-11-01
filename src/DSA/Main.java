package DSA;

public class Main {
    public static int minSubArrayLen(int target, int[] nums) {
        int p1=0;
        int p2=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        while(p2<nums.length){

            if(sum>=target){
                //kaam ho rha hia to mini log find kro jisme kaam ho jae
                //shrink logic
                sum=sum-nums[p1];
                count=p2-p1+1;
                min=Math.min(min,count);
                p1++;

            }else{
                //Kamm naho ho rha ,aur log add kro
                //expand logic
                p2++;
                if(p2>=nums.length){
                    break;
                }
                sum=sum+nums[p2];

            }
        }
        return min;
    }
    public static void main(String[] args) {
        int minLenthCount=minSubArrayLen(7,new int[]{2,3,1,2,4,3});
        System.out.println(minLenthCount);
    }
}
