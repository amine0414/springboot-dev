public class BinarySearch {
    public BinarySearch(){}
    public int BSearch(int Arr[],int size,int element){
        int low=0,high=size-1;
        while(low<high){
            if(element<Arr[(low+high)/2]){
                high=(low+high)/2-1;
            }else if(element>Arr[(low+high)/2]){
                low=(low+high)/2+1;
            }else{
                return (low+high)/2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        int arr[]  = new int[]{1,2,3,4,5,6,7};
        System.out.println(bs.BSearch(arr,7,4));
    }
}
