//Find the maximum element in the array
public class maxEle {
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
    	int maxele=arr[0];//consider max element be 1st element in the array
    	for(int i=1;i<arr.length;i++) {
    		if(maxele<arr[i]) {
    			maxele=arr[i];
    		}
    	}
    	return maxele;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {3,4,1,5,2};
        System.out.println("Original Array:");
        printArr(arr);
        System.out.println("Sorted Array:");
        printArr(sortArr(arr));
        System.out.println("Maximum element(using ele() method): "+ele(arr));
        System.out.println("Maximum element(using sortedArr() method): "+sortArr(arr)[arr.length-1]);
	}

}
