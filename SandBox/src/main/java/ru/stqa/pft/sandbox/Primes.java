package ru.stqa.pft.sandbox;

/**
 * Created by Dmitry on 17.05.2016.
 */
public class Primes {


    public static boolean isPrime(int n){
     for (int i =2; i < n; i++) {
         if (n % i == 0) {
             return false;
         }
     }
      return true;
    }

    public static boolean isPrimeFast(int n){
        for (int i =2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrt(int n){
        int m = (int) Math.sqrt(n);
        for (int i =2; i < m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeWhile(int n){
        int i = 2;
        while (i < n && n % i != 0) {
            return false;
        }    i++;

        return  i == n;
    }

    public static boolean isPrime(long n){
        for (int i =2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
