/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class floodfill {
    
    public static int x[] = {1,-1,0,0};
    public static int y[] = {0,0,1,-1};
    public static boolean checkvalid(int x,int y,int m,int n)
    {
        if(x>=0 && x<=m-1 && y>=0 && y<=n-1)
            return true;
            
        return false;
    }
    public static void modifyno(int r,int c,int oldno,int newno,int m,int n,int a[][],boolean visited[][])
    {
        a[r][c] = newno;
        int i;
        for(i=0;i<4;i++)
        {
            int r1 = r+x[i];
            int c1 = c+y[i];
            if(checkvalid(r1,c1,m,n) && a[r1][c1] == oldno && visited[r1][c1] == false)
            {
                visited[r1][c1] = true;
                modifyno(r1,c1,oldno,newno,m,n,a,visited);
            }
        }
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t>0)
		{
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a[][]= new int[m][n];
		    int i,j;
		    for(i=0;i<m;i++)
		        for(j = 0;j<n;j++)
		            a[i][j] = sc.nextInt();
		    int r = sc.nextInt();
		    int c = sc.nextInt();
		    int newno = sc.nextInt();
		    int oldno = a[r][c];
		    boolean visited[][] = new boolean[m][n];
		    if(checkvalid(r,c,m,n))
		    {
		        visited[r][c] = true;
		        modifyno(r,c,oldno,newno,m,n,a,visited);
		    }
		    for(i=0;i<m;i++)
		        for(j=0;j<n;j++)
		            System.out.print(a[i][j]+" ");
		            
		  System.out.println();
		  t--;
		}
		
	}
}