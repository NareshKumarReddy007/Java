class MathFunctionsDemo {
    public static void main(String[] args) {

        //Basic Operations
        System.out.println(Math.abs(-10));        // 10
        System.out.println(Math.max(10, 20));     // 20
        System.out.println(Math.min(10, 20));     // 10

        //Power & Root
        System.out.println(Math.pow(2, 3));       // 8.0
        System.out.println(Math.sqrt(25));        // 5.0
        System.out.println(Math.cbrt(27));        // 3.0

        // Rounding Functions
        System.out.println(Math.round(4.6));      // 5
        System.out.println(Math.floor(4.9));      // 4.0
        System.out.println(Math.ceil(4.1));       // 5.0

        // Trigonometric (Angle in RADIANS)
        System.out.println(Math.sin(Math.PI / 2));// 1.0
        System.out.println(Math.cos(0));          // 1.0
        System.out.println(Math.tan(0));          // 0.0

        //Logarithmic
        System.out.println(Math.log(10));         // Natural log
        System.out.println(Math.log10(100));      // 2.0
        System.out.println(Math.exp(1));          // e¹

        //Random Number
        System.out.println(Math.random());        // 0.0 to 1.0

        //Sign & Comparison
        System.out.println(Math.signum(-10));     // -1.0
        System.out.println(Math.copySign(5, -1)); // -5.0

        //Advanced
        System.out.println(Math.hypot(3, 4));     // 5.0
        System.out.println(Math.incrementExact(5)); // 6
        System.out.println(Math.decrementExact(5)); // 4
    }
}
