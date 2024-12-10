import java.util.Scanner;

public class EnterNumber {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner (System.in);
        int valuePattern = sc.nextInt();
        System.out.println();
        System.out.println("      "+valuePattern);
        System.out.println("    "+valuePattern+" "+valuePattern+" "+valuePattern);
        System.out.println("  "+valuePattern +" " +valuePattern + " " + valuePattern+" " +valuePattern+" " +valuePattern);
        System.out.println(valuePattern +" " +valuePattern +" " +valuePattern +" " +valuePattern + " " + valuePattern+" " +valuePattern+" " +valuePattern);
        return ;
    }
}
