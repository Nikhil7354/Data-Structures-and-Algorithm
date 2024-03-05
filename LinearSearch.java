public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {4,3,4,5,4,3,47,37,-34,0,-35,73,2973};
//        System.out.println(linearSearch(nums,0));

        System.out.println(searchInRange(nums,-35,3,12));
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int searchInRange(int[] arr,int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}
