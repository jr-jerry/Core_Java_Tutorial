package Generics;

class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int j=i;
            long product=nums[i];
            while(j<n){
                if(i==j && nums[i]<k){
                    count++;
                }else{
                    product=product*nums[j];
                    if(product<k){
                        count++;
                    }
                }
                System.out.println("product: "+product+" k "+k);
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums=new int[]{
                686, 28, 455, 675, 605, 29, 942, 48, 502, 889, 854, 206, 231, 796, 272, 565, 887, 969, 558, 13, 22, 455, 145, 804, 15
        };
        int k=515854;
        numSubarrayProductLessThanK(nums,k);
    }
}