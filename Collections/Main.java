import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Main {
    enum Week
    {
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
            //these are enum constants
            //public,static and final
            //since its final you can create child enum
            //type is week
            Week()
            {
                System.out.println("Constructor called for " +this);
            }
            //enum not extend anything
            //this is not public or protected, only private or default
            //why? we don't want to create new objects
            //this is not the enum concept, thats why
            //internally : public static final Week Monday=new Week();
    }
    
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
        list2.add(34);
        list2.add(16);
        list2.add(29);
        System.out.println(list2);
        //vector  is a synchronous . only one thread can access data . vector is slow
        //array is all can access. any thread can access data. array is fast
        List<Integer>vec=new Vector<>();
        vec.add(34);
        vec.add(16);
        vec.add(29);
        System.out.println(vec);
        //enum it is group of variables ,it cannot change it is a constant 
        Week wek;
        wek=Week.Monday;
        /*for(Week day:Week.values())
        {
            System.out.println(day);
        }*/
        //System.out.println(wek.ordinal());
        // ordinal -> position of the enum declaration 
    }
}
