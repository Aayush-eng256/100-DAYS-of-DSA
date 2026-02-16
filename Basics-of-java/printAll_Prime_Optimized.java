public class printAll_Prime_Optimized {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2;i*i <=n;i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
         return isPrime;
    }
    public static void primeInRange(int n) {
        for(int i = 2;i<=n;i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]) {
      int n = 5;
      primeInRange(n);
    }
}