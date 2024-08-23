//Striver DSA Sheet(Array)
//Q3: Check the array is sorted or not and rotate it accordingly
public class Q3 {
    public static boolean checkSort(int ar[]) {
    	int x=0;
    	boolean check=true;
    	for(int i=0;i<ar.length-1;i++) {
    		if(ar[i]>ar[i+1]) {
    			check=false;
    		    break;
    		}
    		x++;
    	}
    	return check;
    }
    public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {3,4,5,1,2};//original array
        System.out.println("Print arr: ");
        printArr(arr);
        int size=arr.length;
        //System.out.println("LenArr: "+size);
        int arr1[]= new int[size];//empty array
        int ror=1;
        for(int i=0;i<size-1;i++) {
        	//System.out.print("arr: "+arr[i]+" arr1: "+arr[i+1]);
        	//System.out.println();
        	if(arr[i]>arr[i+1]) {//if small int encounter slice the array
        		break;           //i.e, {3,4,5} & {1,2}
        	}
        	else {
        		ror++;//updating the rotation value
        	}
        }
        int size1=size-ror;//last two elements
        //System.out.println("LenArr1: "+size1);
        for(int j=0,r=ror;j<size1;j++,r++) {//arr1={1,2}
        	arr1[j]=arr[r];
        }
        System.out.println("Print arr1: ");
        printArr(arr1);
        for(int m=size1,n=0;m<size;m++,n++) {
        	arr1[m]=arr[n];//{3,4,5} gets added after {1,2}
        }
        System.out.println("Print arr1: ");
        printArr(arr1);
        if(checkSort(arr)==false) {
        	System.out.println("Is arr1 sorted? "+checkSort(arr1));
        	System.out.println("No. of rotations: "+ror);	
        }
	}

}
