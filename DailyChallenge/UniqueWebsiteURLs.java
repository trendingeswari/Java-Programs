/*
 The program must accept N string values representing the website URLs and print the count of unique websites. 
 Boundary Condition(s): 2 <= N <= 50 5 <= Length of each string <= 50 
 Input Format: The first line contains N. The next N lines, each containing a string. 
 Output Format: The first line contains the count of unique websites. 
 Example Input/Output 1: 
 Input: 
 6 
 www.skillrack.com 
 http://www.skillrack.com 
 https://www.skillrack.com 
 www.google.com 
 http://www.google.com 
 google.com 
 Output: 
 2 
 Explanation: In the given 6 URLs, the unique websites are skillrack.com and google.com. Hence the output is 2 
 Example Input/Output 2: 
 Input: 
 9 
 www.skillrack.com 
 http://www.skillrack.com 
 https://www.skillrack.com 
 www.google.com 
 http://www.google.com 
 google.com 
 www.google.in 
 skillrack.com 
 www.skillrack.in 
 Output: 
 4
 */

import java.util.Scanner;

public class UniqueWebsiteURLs {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
		    a[i]=sc.nextLine();
		}
        sc.close();
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i].length()>a[j].length()){
		            String temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		int count=0;
		for(int i=0;i<n;i++){
		    boolean flag=true;
		    for(int j=0;j<n;j++){
		        if(a[i].indexOf(a[j])>=0){
		            if(j<i){
		                flag=false;
		                break;
		            }
		        }
		    }
		    if(flag){
		        count++;
		    }
		}
		System.out.println(count);

	}
}
