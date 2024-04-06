public class Armstrong {
    public static void main(String[] args) {
        int n =153;
        int sum = 0;
        boolean flag;
        while (n > 0){
            int rem = n%10;

            sum = sum + rem*rem*rem;
            n = n/10;

        }
        System.out.println(flag = sum == n);
    }
}
