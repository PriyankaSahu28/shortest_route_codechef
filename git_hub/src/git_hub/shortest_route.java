package git_hub;

import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class shortest_route {

	
			public static void main (String[] args) throws java.lang.Exception
			{
				// your code goes here
				BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		          int t= Integer.parseInt(br.readLine());
		while(t-->0) {
		 
		 String [] nm = br.readLine().trim().split(" ");
		int n= Integer.parseInt(nm[0]);
		int m= Integer.parseInt(nm[1]);

		  
		  int arr[] = new int[n+1];
		  String [] abm = br.readLine().trim().split(" ");

		  int dp[] = new int[n+1];
		  int x = -1;
		  for(int i =1; i <= n; i++) {
		     
		      arr[i] = Integer.parseInt(abm[i-1]);

		      if(arr[i] == 1)
		      x =i;

		      if(x == -1) {
		          dp[i]=-1;
		      } else {
		          dp[i] = i-x;

		      }
		  }
		    x =-1;
		    for(int i =n; i >0; i--) {
		        int temp;
		        if(arr[i] == 2)
		        x =i;

		        if(x != -1) {
		            temp = x-i;
		            if(temp < dp[i] || dp[i] ==-1)
		            dp[i] = temp;
		        }
		    }

		         dp[1] = 0;

		         String [] abp = br.readLine().trim().split(" ");
		         BufferedWriter output = new BufferedWriter(
		            new OutputStreamWriter(System.out));
		         
		      
		         for(int i =0; i <m; i++) {
		             int y = Integer.parseInt(abp[i-1]); 
		              
		             
		             output.write(dp[y] + " ");
		         }
		          output.write("\n");
		                  output.flush();
		}
			}
		                                         //This Code is Contributed by Priyanka Sahu


	}


