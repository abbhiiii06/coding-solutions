class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int mid=arr.length/2;
        int newarr[]=new int[arr.length];
        int pos=0;
        int pos1=1;
        for(int i=arr.length-1;i>=mid;i--){
            newarr[pos]=arr[i];
            pos=pos+2;
        }
        for(int i=0;i<mid;i++){
            newarr[pos1]=arr[i];
            pos1=pos1+2;
        }
        for(int i=0;i<newarr.length;i++){
            arr[i]=newarr[i];
            
        }
    }
}
