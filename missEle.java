//Find the missing element in the array
public class missEle {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	public static int[] sortArr(int arr[]) {
    	//BubbleSort
    	for(int r=1;r<arr.length;r++) {
    	for(int i=0;i<arr.length-r;i++) {
    		if(arr[i]>arr[i+1]) {
    			int t=arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=t;
    		}
    	}
    	}
    	return arr;
    }
	public static int ele(int arr[]) {
		int start=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=start)
        		break;
        	start++;
        }
        return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {4,1,2};
        System.out.println("Original Array:");
        printArr(a);
        System.out.println("Sorted Array:");
        sortArr(a);
        System.out.println("Missing element: "+ele(sortArr(a)));
	}

}
