class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        if(i<arr.length-1){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[j]);
                }
                i++;
            }
        }
        return list;
    }
}