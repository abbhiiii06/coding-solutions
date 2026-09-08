class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
         ArrayList<Integer> list=new ArrayList<>();
         list.add(min);
         list.add(max);
         return list;
    }
}
