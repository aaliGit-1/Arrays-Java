//Striver DSA Sheet(Array)
//Q5&Q6: Left and Right rotate of an array 
import java.util.Scanner;
public class leftRotate {
	public static int[] r_Rotate(int a[],int k) {
		int len_a=a.length;
        int b[]=new int[len_a];
        //for left rotation we are taking last k no. elements
        for(int i=len_a-k,j=0;i<len_a;i++,j++) {
        	b[j]=a[i];
        }
        //System.out.println("Print b: ");
        //printArr(b);
        for(int m=0,n=k;m<len_a-k;m++,n++) {
        	b[n]=a[m];
        }
        return b;
	}
	//  Correct the code
	public static int[] l_Rotate(int a[],int k) {
		int len_a=a.length;
        int b[]=new int[len_a];
        //for left rotation we are taking last k no. elements
        for(int i=k,j=0;i<len_a;i++,j++) {
        	b[j]=a[i];
        }
        //System.out.println("Print b: ");
        //printArr(b);
        for(int m=0,n=len_a-k;m<k;m++,n++) {
        	b[n]=a[m];
        }
        return b;
	}
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a[]= {1,2,3,4,5,6,7};
        System.out.println("Print Original Array: ");
        printArr(a);
        System.out.println("Enter k-rotations: ");
        int k=sc.nextInt();
        int len_a=a.length;
        int b[]=new int[len_a];
        System.out.println("Print k-Right-Rotated Array: ");
        printArr(r_Rotate(a,k));
        System.out.println("Print k-Left-Rotated Array: ");
        printArr(l_Rotate(a,k));
	}

}
