//Striver DSA Sheet(Array)
//Q7: Move Zeroes at the end of the array
public class moveZero {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {0,1,0,0,1,1};
        int b[]=new int[a.length];
        //Using an extra array b
        /*for(int i=0,j=0;i<a.length;i++) {
        	if(a[i]!=0) {
        		b[j]=a[i];
        		j++;
        	}
        }
        System.out.println("Print b-Array: ");
        printArr(b);*/
        
        //Without using an extra array (manipulate the array a)
        for(int m=0,n=1;n<a.length&&m<a.length-1;) {
        	if((a[m]==0&&a[n]!=0)) {
        		int temp=a[m];//swap a[m]&a[n]
        		a[m]=a[n];
        		a[n]=temp;
        		m++;n++;
        	}
        	else if(a[m]==0&&a[n]==0) {
        		n++;
        	}
        	else {
        		m++;n++;
        	}
        }
        System.out.println("Print a array: ");
        printArr(a);
	}

}
