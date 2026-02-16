public class basics {
  public static int findMissing(int arr[]) {
  int missing = 1;
  for(int i = 0;i<arr.length;i++) {
    if(arr[i] > 0) {
      if(arr[i] == missing) {
        missing++;
      } else if (arr[i] > missing) {
        break;
      }
    }
  }
   return missing;
  }
  public static void merge(int arr[],int si,int mid,int ei) {
    int temp[] = new int[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;
    while(i<=mid && j<=ei) {
      if(arr[i]< arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    // left part of the array;
    while(i<= mid) {
      temp[k++] = arr[i++];
    }
    // right part of the array;
    while(j<= ei) {
      temp[k++] = arr[j++];
    }
     // copying array to original array;
     for(k = 0,i = si;k<temp.length;k++,i++) {
        arr[i] = temp[k];
     }
  }
  public static void mergeSort(int arr[],int si,int ei) {
    if(si>= ei) {
      return;
    }
    int mid = si + (ei-si)/2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);
    merge(arr,si,mid,ei);
  }
  public static void printArr(int arr[]) {
    for(int i = 0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
      int arr[] = {4,2,0,-1,1,3};
      mergeSort(arr,0,arr.length-1);
      printArr(arr);
      int missing = findMissing(arr);
      System.out.print("The smallest positive missing number is: " + missing);
  }
}