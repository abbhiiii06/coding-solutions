import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int firstlargest=0;
            int secondlargest=0;
            int sum=0;
            for(int i=0;i<a.length;i++){
                if(a[i]>firstlargest){
                    secondlargest=firstlargest;
                    firstlargest=a[i];
                }
                if(a[i]>secondlargest && a[i]!=firstlargest){
                    secondlargest=a[i];
                }
                sum=firstlargest+secondlargest;
            }
            System.out.println(sum);
        }
    }
}
