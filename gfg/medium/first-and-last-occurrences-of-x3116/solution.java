class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
      ArrayList<Integer> a=new ArrayList<>();
      ArrayList<Integer> b=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i]==x){
              a.add(i);
          }
      }
      int newarr[]={-1,-1};
      if(!a.isEmpty()){
          newarr[0]=a.getFirst();
          newarr[1]=a.getLast();
      }
      for(int num:newarr){
          b.add(num);
      }
      return b;
    }
}
