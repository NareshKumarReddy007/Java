import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int remainder,b=0;
        int temp=num;
        while(num!=0)
        {
            remainder=num%10;
            b=b*10+remainder;
            num=num/10;
        }
        if(b==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
