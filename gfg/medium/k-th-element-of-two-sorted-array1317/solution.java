class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int element=0;
        int i=0;
        int j=0;
        int newarr[]=new int[a.length+b.length];
        int m=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                newarr[m]=a[i];
                i++;
                m++;
            }else{
                newarr[m]=b[j];
                j++;
                m++;
            }
        }
        while(i<a.length){
            newarr[m]=a[i];
            i++;
            m++;
        }
        while(j<b.length){
            newarr[m]=b[j];
            j++;
            m++;
        }
        element=newarr[k-1];
        return element;
    }
}