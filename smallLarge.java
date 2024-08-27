//Kth smallest and Kth Largest element in an array
//In an array, given K value we need to find the smallest/largest element at Kth position
//Approach: We need to sort the array then take out the smallest/largest element from Kth position
public class smallLarge {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	//Insertion Sort
	public static int[] sortArr(int a[]) {
    	for(int i=1;i<a.length;i++) {
    		int ind=i;
    		for(int j=i-1;j>-1&j<ind;j--,ind--) {
    			if(a[ind]<a[j]) {
    				int tem=a[ind];
    				a[ind]=a[j];
    				a[j]=tem;
    			}
    			//if a[j]<a[ind] then further check is not valid as all the elements will be sorted further
    			//i.e., [3,4,7,10,15,20],10<15(no swap) so 7<15(no further check needed) 
    			else if(a[ind]>a[j]) {
    				break;
    			}
    		}
    		//printArr(a);
    	}
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,10,4,3,20,15};
		int k=3;
		System.out.println("Original Array:");
		printArr(ar);
		System.out.println("Sort the array: ");
		printArr(sortArr(ar));
		//Kth smallest
		System.out.println("Kth smallest: "+sortArr(ar)[k-1]);
		//Kth largest
		System.out.println("Kth largest: "+sortArr(ar)[ar.length-3]);
	}

}
