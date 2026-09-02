import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		   Scanner SC=new Scanner(System.in);
	       int T=SC.nextInt();
	       int max=0;
	       for(int i=0;i<T;i++){
	           int N=SC.nextInt();
	           for(int j=0;j<N;j++){
	               int val=SC.nextInt();
	               if(val>max){
	                   max=val;
	               }
	           }
	       }
	       System.out.println(max);

	}
}
