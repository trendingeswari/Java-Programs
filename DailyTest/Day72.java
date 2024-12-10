import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Map<String, Integer> bookMap = new HashMap<>();
    for(int i=0;i<n;i++){
        String[] input = sc.nextLine().split(" ");
        String bookName = input[0];
        int publishedYear = Integer.parseInt(input[1]);
        if(! bookMap.containsKey(bookName) || bookMap.get(bookName)<publishedYear){
            bookMap.put(bookName, publishedYear);
        }
    }
    List<Map.Entry<String, Integer>> bookList = new ArrayList<>(bookMap.entrySet());
    bookList.sort((entry1, entry2)->{
        int yearCompare = entry2.getValue().compareTo(entry1.getValue());
        if(yearCompare == 0){
            return entry1.getKey().compareTo(entry2.getKey());
        }
        else
        {
            return yearCompare;
        }
    });
    for(Map.Entry<String,Integer> entry:bookList){
        System.out.println(entry.getKey()+ " "+entry.getValue());
    }
    sc.close();
	}
}
