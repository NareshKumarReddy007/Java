import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Euclidean algorithm for GCD
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
