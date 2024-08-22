//Striver DSA Sheet
//find longest Sub-array so that the sum is same as given K 
public class longSubArr {
	public static void printArr(int ar[],int start,int end) {
    	for(int i=start;i<end;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	public static int sumArr(int ar[],int start,int end) {
		int sum=0,c=0;
		for(int i=start;i<end;i++) {
			sum+=ar[i];
			c++;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,5,2,7,1,9};
        int k=15;
        int len=0;
        //Generate all sub-arrays
        for(int i=0;i<arr.length;i++) {
        	for(int j=i;j<arr.length;j++) {
        		int sum=sumArr(arr,i,j+1);
        		if(sum==k&&len<arr.length) {
        			len=j+1;
        			printArr(arr,i,j+1);
        			System.out.println("Length of the sub-array: "+(len-i));
        		}
        	}
        }
        
	}

}
