import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static int function(int dp[],int n)
	{
	    if(n<=1)
	    return n;
	    
	    
	    
	    if(dp[n]!=-1)
	    return dp[n];
	    
	     return dp[n]=Math.max(n, function(dp,n/2)+function(dp,n/3)+function(dp,n/4));
	}
	public static void main (String[] args)
	 {
	    Scanner sc =  new Scanner(System.in);
	    int  t = sc.nextInt();
	    while(t>0)
	    {
	        int n = sc.nextInt();
	        int dp[] = new int[n+1];
	        Arrays.fill(dp,-1);
	        System.out.println(function(dp,n));
	        t--;
	    }
	 }
}