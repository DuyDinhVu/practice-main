/**
 * ******************
 * Peter Do
 * Prime Numbers
 * Exercise 6.25abc
 * 3/14/2022
 * ******************
 */

public class PrimeNumbers {
    public static boolean isPrime(int n){

        // skip all even numbers
        for(int i=3; i <= n/2; i+=2){
            if(n % i  == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSquareRoot(int n){

        // skip all even numbers
        for(int i=3; i <= Math.sqrt(n); i+=2){
            if(n % i  == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeList1(int range){
        long start = System.currentTimeMillis(), end;
        
        int count = 1, testCount = 0;
        System.out.print("2 ");
        for ( int n = 3; n < range; n+=2)
        {
            testCount++;
            if (isPrime(n)) {
                System.out.print(n + " ");
                count = count +1;
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        end = System.currentTimeMillis();
        System.out.printf("\n--- There are %d prime numbers up to %d" , count, range);
        System.out.printf("\n--- Number of tests count %d, time Lapse: %d millisecond\n" , testCount, end - start);
    }
    public static void primeList2(int range) {
        long start = System.currentTimeMillis(), end;
        int count = 1, testCount = 0;
        System.out.print("2 ");
        for (int n = 3; n <= range; n+=2) {
            testCount++;
            if (isPrimeSquareRoot(n)) {
                System.out.print(n + " ");
                count = count +1;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        end = System.currentTimeMillis();
        System.out.printf("\n--- There are %d prime numbers up to %d" , count, range);
        System.out.printf("\n--- Number of Test count %d, time Lapse: %d millisecond\n" , testCount, end - start);
    }

    public static void main(String[] args) {
        System.out.println("\n--- Find Prime using half value method:");
        primeList1(100000);
        System.out.println("\n--- Find Prime using square root method:");
        primeList2(100000);
    }
}
