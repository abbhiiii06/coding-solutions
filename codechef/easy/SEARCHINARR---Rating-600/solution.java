public static String solve(int N, int X, int[] A) {
    for(int i=0;i<A.length;i++){
        if(A[i]==X){
            return "yes";
        }
    }
    return "No";
        
}