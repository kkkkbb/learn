/**
 * @author czq
 * @version 1.0
 */
class erfenfa {
    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        erfenfa erfenfa = new erfenfa();
        System.out.println(erfenfa.search(nums,target));
    }
    public int search(int[] nums, int target) {
        int index = 0;
        int left = 0;
        int right  = nums.length - 1;
        int zhongjian = 0;
        while (left <= right) {

            zhongjian =( (left + right + 1) / 2);


            if(nums[zhongjian] > target){
                right = zhongjian - 1;
            }else if(nums[zhongjian] < target){
                left = zhongjian + 1;
            }else{
                index = zhongjian;
                return index;
            }
        }


        return -1;
    }
}
