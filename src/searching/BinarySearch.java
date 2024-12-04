package DSA_In_Java.src.searching;

public class BinarySearch {
  
    public static int binarySearch(int arr[], int target) {
        int st=0, end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,8,9,13,16,26};
        int target=8;

        System.out.println("The searching element is at index "+binarySearch(arr,target));
    }
}
