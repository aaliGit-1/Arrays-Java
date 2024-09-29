//Q3:Choose maximum number of Pizza
public class maxPizza {
	public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int maxLength(int n,int k,int arr[]){
        int flav=k-1;
        int maxElem=0;
        int count=1;
        int maxCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxElem){
                maxElem=arr[i];
            }
        }
        if(maxElem==flav)
            return n;
        else{
            int ele=arr[0];
            for(int j=1;j<n-1;j++){
                if(arr[j]==ele){
                    count++;
                    //System.out.println("maxC:"+maxCount);
                }
                else if(arr[j]!=ele){
                    ele=arr[j];
                    maxCount=maxCount<count?count:maxCount;
                    count=0;
                    System.out.println("maxC:"+maxCount);
                }
            }
            maxCount=maxCount<count?count:maxCount;
        }
        return maxCount;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,k=2;
        int arr[]={1,1,1,2,2,1};
        System.out.println("Output: "+maxLength(n,k,arr));
	}

}
