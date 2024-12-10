/*
 The program must accept N integers representing the N page requests and the size S of an LRU (Least
Recently Used) cache as the input. The program must print the pages in the cache after N page
requests as the output.
Note: The recently requested page is always present on the left-side of the LRU cache.
Boundary Condition(s):
1 <= N, Each integer value <= 1000
1 <= S <= 100
Input Format:
The first line contains N.
The second line contains S.
The third line contains N integers separated by a space.
Output Format:
The first line contains the pages in the cache after N page requests.
Example Input/Output 1:
Input:
5
3
1 2 1 3 1
Output:
2 3 1
Explanation:
Here N = 5 and S = 3.
Initially, there is no page in the cache.
Page 1 is requested, so 1 is added to the cache. Now the cache contains 1.
Page 2 is requested, so 2 is added to the cache. Now the cache contains 1, 2.
Page 1 is requested again, but 1 is already in the cache. Now the cache contains 2, 1.
Page 3 is requested, so 3 is added to the cache. Now the cache contains 2, 1, 3.
Page 1 is requested again, but 1 is already in the cache. Now the cache contains 2, 3, 1.
After the 5 requests, the pages in the cache are 2, 3 and 1.
Hence the output is 2 3 1
Example Input/Output 2:
Input:
12
5
7 8 10 8 7 6 6 4 2 1 1 10
Output:
6 4 2 1 10

 */
import java.util.*;
public class LRU_Cache_N_Request {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int cache[] = new int[S];
        int cacheIndex = S-1;
        for(int index=N-1;index>=0&&cacheIndex>=0;index--){
            int i;
            for(i=cacheIndex;i<S;i++){
                if(cache[i]==arr[index]){
                    break;
                }
            }
            if(i==S){
                cache[cacheIndex--] = arr[index];
            }
        }
        for(int i=0;i<S;i++){
            System.out.print(cache[i]+" ");
        }
	}
}
