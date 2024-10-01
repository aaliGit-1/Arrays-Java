
public class removeDup {
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
		int arr2[]= {1,1,1,2,2,3,3,3};
	    printArr(remDup(arr2));
	}

}
