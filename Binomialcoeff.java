public class Binomialcoeff {
    public static int Binomialcoeff(int n,int r) {
     int nfac = factorial(n);
     int rfac = factorial(r);
     int nmr = factorial(n-r);
     int ans = nfac/(rfac*nmr);
     return ans;
    }
    public static int factorial(int n) {
        int fac = 1;
        for(n = n;n>=1;n--) {
         fac *= n;
        }
        return fac;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.print(Binomialcoeff(n, r));

    }
}