public class largestInArray {
    public static int largest(int arr[]) {
        int largest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6};
        System.out.println("largest value is: " + largest(number));

    }
}