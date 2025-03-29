public class Main{
    public static void main(String[] args){
        int nums[] = new int[1000];
        int target = 900;

    //    int result = linearSearch(nums, target);
        int result = binarySearch(nums, target, 0, nums.length);

        if (result!=-1) {
            System.out.println("Element found at index : " + result);
        }
        else {
            System.out.println("Element not found");
        }

    }

    public static int linearSearch(int[] nums, int target){

        int steps = 0;
        for(int i = 0; i< nums.length; i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken by linear Search"+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear Search"+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right){
        //5,7,9,11,13

        if(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                binarySearch(nums,target,mid+1,right);
            }
            else {
                binarySearch(nums,target,left,mid-1);
            }
        }

        return -1;





//
//        int steps =0;
//        int left = 0;
//        int right = nums.length-1;



//        while(left <= right){
//            steps ++;
//            int mid = (left+right)/2;
//
//            if(nums[mid] == target){
//                System.out.println("Steps taken by binary Search"+steps);
//                return mid;
//            }
//            else if(nums[mid]<target){
//                left = mid+1;
//            }
//            else{
//                right =mid-1;
//            }
//        }
//        System.out.println("Steps taken by binary Search"+steps);
//        return -1;
    }
}