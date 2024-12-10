import java.util.Scanner;

public class DataTypesJava {
    public static void main(AbbrevationMatching[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = sc.nextBoolean();
        byte Byte = sc.nextByte();
        //sc.nextLine();
        char Character = sc.next().charAt(0);
        short Short = sc.nextShort();
        int Int = sc.nextInt();
        long Long = sc.nextLong();
        float Float = sc.nextFloat();
        double Double = sc.nextDouble();
        sc.nextLine();
        AbbrevationMatching string = sc.nextLine();
        System.out.println(bool+" "+Byte+" "+Character+" "+Short+" "+Int+" "+Long+" "+Float+" "+Double+" "+string);
        return ;
    }
}
