//Kenneth Smith 
//Module 3
//8-24-2024

public class KennethIntegerTest {
    public static void main(String[] args) {
        // Create instances of KennethInteger
        KennethInteger kennethTest1 = new KennethInteger(5);
        KennethInteger kennethTest2 = new KennethInteger(5);
        KennethInteger kennethTest3 = new KennethInteger(8);

        // Test non-static methods
        System.out.println("kennethTest1 is odd: " + kennethTest1.isOdd()); // true
        System.out.println("kennethTest2 is prime: " + kennethTest2.isPrime()); // true
        System.out.println("kennethTest3 is even: " + kennethTest3.isEven()); // true

        // Test equals method using int
        System.out.println("kennethTest1 equals 5: " + kennethTest1.equals(5)); // true
        System.out.println("kennethTest3 equals 5: " + kennethTest3.equals(5)); // false

        // Test equals method using Integer
        System.out.println("kennethTest2 equals Integer(5): " + kennethTest2.equals(Integer.valueOf(5))); // true
        System.out.println("kennethTest3 equals Integer(5): " + kennethTest3.equals(Integer.valueOf(5))); // false

        // Test static methods using int
        System.out.println("Static method isEven(4): " + KennethInteger.isEven(4)); // true
        System.out.println("Static method isOdd(7): " + KennethInteger.isOdd(7)); // true
        System.out.println("Static method isPrime(13): " + KennethInteger.isPrime(13)); // true

        // Test static methods using Integer
        System.out.println("Static method isEven(Integer(6)): " + KennethInteger.isEven(Integer.valueOf(6))); // true
        System.out.println("Static method isOdd(Integer(9)): " + KennethInteger.isOdd(Integer.valueOf(9))); // true
        System.out.println("Static method isPrime(Integer(17)): " + KennethInteger.isPrime(Integer.valueOf(17))); // true

        // Testing null 
        System.out.println("Test isEven(null): " + KennethInteger.isEven((Integer) null)); // false
        System.out.println("Test isOdd(null): " + KennethInteger.isOdd((Integer) null)); // false
        System.out.println("Test isPrime(null): " + KennethInteger.isPrime((Integer) null)); // false
    }
}

