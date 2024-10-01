import java.util.Arrays;

//Second Smallest/ Largest element
public class secondSmallNum {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	public static int[] remDup(int arr[]) {
		int hashArr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			hashArr[arr[i]]+=1;
		}
		//printArr(hashArr);
		int newArr[]=new int[arr.length];
		for(int j=0,k=0;j<hashArr.length&&k<newArr.length;j++) {
			if(hashArr[j]>=1) {
				newArr[k]=j;
				k++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,2,4,6,8};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println("2nd Smallest: "+arr[1]);
        System.out.println("2nd Largest: "+arr[arr.length-2]);
	    
	}

}
