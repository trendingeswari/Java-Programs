/*
Distinct Count - String Left Shift

The program must accept a string S containing only alphabets as the input. The program must print the count of distinct string values formed when shifting the alphabets in S to the left as the output.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains an integer representing the count of distinct string values formed when shifting the alphabets in S to the left.
Example Input/Output 1:
Input:
abab
Output: 2
Explanation:
The possible combinations when shifting the alphabets in abab to the left are baba, abab, baba and abab.
Here the distinct strings are baba and abab.
So the count 2 is printed as the output.
Example Input/Output 2:
Input:
aSasa
Output: 
5
Example Input/Output 3:
Input:
ААВВАААВВА
Output:
5
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		Map<String,Character> map=new LinkedHashMap<>();
		for(int i=0;i<s.length;i++){
		    map.put(s[i],s[i].charAt(s[i].length()-1));
		}
		List<Map.Entry<String,Character>> list=new ArrayList<>(map.entrySet());
		list.sort((a,b)->{
		    return a.getValue()-b.getValue();
		});
		for(Map.Entry<String,Character> i:list){
		    System.out.print(i.getKey()+" ");
		}
        sc.close();
	}
}
/* 
    Or
 
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		HashMap<Character,List<String>> h=new HashMap<>();
		char b[]=new char[a.length];
		for(int i=0;i<a.length;i++){
		    char c=a[i].charAt(a[i].length()-1);
		    List<String> l= h.getOrDefault(c,new ArrayList<>());
		    b[i]=c;
		    l.add(a[i]);
		    h.put(c,l);
		}
		Arrays.sort(b);
		for(char i:b){
		    List<String > l=h.get(i);
		    
		   
		    System.out.print(l.get(0)+" ");
		    l.remove(0);
		    
		}
		

	}

    or

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String arr[]=sc.nextLine().split(" ");
		String ann[]=new String[arr.length];
		for(int i=0;i<ann.length;i++){
		    ann[i]=String.valueOf(arr[i].charAt(arr[i].length()- 1));
		}
Arrays.sort(ann);
String n="";
int amm[]=new int[arr.length];
for(int i=0;i<amm.length;i++){
    amm[i]=0;
}
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        String m=String.valueOf(arr[j].charAt(arr[j].length()-1));
        if(ann[i].equals(m)&&amm[j]==0){
            amm[j]=1;
            n+=arr[j];
            n+=" ";
        }
    }
}
System.out.print(n);
	}
 */
