//Striver DSA Sheet(Array)
//Q: Print number of unique elements from an array
public class remDup {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,1,2,2,4,5};
        System.out.println("Print a-Array: ");
        printArr(a);
        int ind=0;
        for(int j=1;j<a.length;j++) {
        	if(a[ind]!=a[j]) {
        		a[ind+1]=a[j];
        		ind++;
        		//printArr(a);
        	}
        }
        
        System.out.println("Unique elements: "+(ind+1));
	}

}
