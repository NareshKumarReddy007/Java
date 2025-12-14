public class Randomrange {
    public static void main(String args[])
    {
        int minbound=10;
        int maxbound=20;
        int random=(int)(Math.random()*(maxbound-minbound+1))+minbound;// 20-10+1=11 maxbound inclusive(size of range) , * fit the random value in range ,+minbound changes the range from 0tomaxbound to minbound to maxbound
        System.out.println(random);//Math.random() results random double value

    }
}
