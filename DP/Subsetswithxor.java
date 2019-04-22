import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static int function(int a[],int n,int dp[][],int k,int x)
	{
	    if(n<0){
	    if(x==k)
	        return 1;
	    else
	        return 0;
	    }
	    if(dp[n][x]!=-1)
	    return dp[n][x];
	    
	    return(dp[n][x] = function(a,n-1,dp,k,x)+function(a,n-1,dp,k,x^a[n]));
	}
	public static void main (String[] args)
	 {
	    Scanner sc =  new Scanner(System.in);
	    int  t = sc.nextInt();
	    while(t>0)
	    {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int a[] = new int[n];
	        int i;
	        for(i=0;i<n;i++)
	        a[i] = sc.nextInt();
	        
	        int dp[][] = new int[n][10000];
	        for(int x[]:dp)
	        Arrays.fill(x,-1);
	        
	        System.out.println(function(a,n-1,dp,k,0));
	        t--;
	    }
	 }
}