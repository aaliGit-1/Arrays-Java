//Striver DSA Sheet(Array)
//Q8: Union of 2 Arrays(Check UNION CODE) 
import java.util.*;
public class unionArray {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		if(ar[i]!=0)
    			System.out.print(ar[i]+" ");//print only non-zero element
    	}
    	System.out.println();
    }
    public static int[] interArr(int a[],int b[]) {
    	int len=a.length<=b.length?a.length:b.length;//length of the smallest array is stored in len
    	int inter[]=new int[len];
    	int index=0;//index value of inter[] array
    	for(int i=0,j=0;i<a.length&j<b.length;) {
    		if(a[i]<b[j]) {
    			i++;
    		}
    		else if(b[j]<a[i]) {
    			j++;
    		}
    		else {
    			inter[index]=a[i];
    			index++;
    			i++;j++;
    		}
    	}
    	return inter;
    }
    public static int[] uniArr(int a[],int b[]) {//CHECK UNION CODE RETRY
    	int last_a=a[a.length-1];//taking last element of a
    	int last_b=b[b.length-1];//taking last element of b
    	int len=last_a>last_b?last_a:last_b;//whoever is greater the len is assigned to it 
    	System.out.println("last_a:"+last_a+",last_b:"+last_b+",len:"+len);
    	int union[]=new int[len];
    	int index=0;
    	for(int i=0,j=0;i<a.length||j<b.length;) {
    		System.out.println("a[i]:"+a[i]+",b[j]:"+b[j]+",index:"+index);
    		if(a[i]<b[j]) {
    			union[index]=a[i];
    			System.out.println("union:"+a[i]);
    			index++;
    			i++;
    		}
    		else if(b[j]<a[i]) {
    			union[index]=b[j];
    			System.out.println("union:"+b[j]);
    			index++;
    			j++;
    		}
    		else {
    			union[index]=a[i];
    			System.out.println("union:"+a[i]);
    			index++;
    			i++;j++;
    		}
    	}
    	return union;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,3,5,7};
        System.out.println("Array a[]:");
        printArr(a);
        int b[]= {2,3,5,6};
        System.out.println("Array b[]:");
        printArr(b);
        System.out.println("Intersection of both the arrays:");
        printArr(interArr(a,b));
        System.out.println("Union of both the arrays:");
        printArr(uniArr(a,b));
	}

}
