import java.util.Arrays;

public class ArrayOddEven {
    public static void main(String[] args) {
//        var array = [-1,2,4,-5,6,-8,3,10,-7];
//        output = array =[2, -1, 4, -5, 6,-8,3,-7,10]

        int[] arr = {-1,2,4,-5,6,-8,3,10,-7};
        int[] ans = new int[arr.length*2];

        for (int i = 1; i < arr.length; i++) {
                if (arr[i] < 0){
                    if (i % 2 == 0){
                        ans[i+1] = arr[i];
                    }
                }
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0){
                if (i % 2 != 0){
                    ans[i+1] = arr[i];
                }
            }
        }
            System.out.print(Arrays.toString(ans));

    }
}
