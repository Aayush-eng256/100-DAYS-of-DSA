public class BinToDec {
    public static int binToDec(int bin) {
        int decimal = 0;
        int power = 0;
        while(bin > 0) {
            int lastDigit = bin % 10;
            decimal = decimal + (int)(lastDigit * Math.pow(2,power));
            bin = bin / 10;
            power++;
        }
        return decimal;
    }
 public static void main(String args[]) {
    int bin = 101;
    System.out.print(binToDec(bin));

 }
}