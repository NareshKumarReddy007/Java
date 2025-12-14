import java.util.*;
class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = String.valueOf(n).length();//count for digits number
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
