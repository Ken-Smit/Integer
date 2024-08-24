//Kenneth Smith 
//Module 3
//8-24-2024

public class KennethInteger {
    public int kenneth;

    // Constructor
    public KennethInteger(int kenneth) {
        this.kenneth = kenneth;
    }

    // Getter Method
    public int getInt() {
        return kenneth;
    }

    // Setter Method
    public void setInt(int kenneth) {
        this.kenneth = kenneth;
    }

    // Non-static methods
    public boolean isEven() {
        return kenneth % 2 == 0;
    }

    public boolean isOdd() {
        return kenneth % 2 != 0;
    }

    public boolean isPrime() {
        if (kenneth <= 1) return false;
        for (int i = 2; i <= Math.sqrt(kenneth); i++) {
            if (kenneth % i == 0) return false;
        }
        return true;
    }

    // Static methods using int parameter
    public static boolean isEven(int kenneth) {
        return kenneth % 2 == 0;
    }

    public static boolean isOdd(int kenneth) {
        return kenneth % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Static methods using Integer parameter
    public static boolean isEven(Integer kenneth) {
        return kenneth != null && kenneth % 2 == 0;
    }

    public static boolean isOdd(Integer kenneth) {
        return kenneth != null && kenneth % 2 != 0;
    }

    public static boolean isPrime(Integer kenneth) {
        if (kenneth == null || kenneth <= 1) return false;
        for (int i = 2; i <= Math.sqrt(kenneth); i++) {
            if (kenneth % i == 0) return false;
        }
        return true;
    }

    // equals methods
    public boolean equals(int diffValue) {
        return this.kenneth == diffValue;
    }

    public boolean equals(Integer diffValue) {
        return this.kenneth == (diffValue != null ? diffValue : 0);
    }
}

