import java.util.ArrayList;

public class coll {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bhanu");
        names.add(1,"mani");
        names.add("mani");

        //names.remove(0);
       // names.remove("mani");
     for(String a:names){
         System.out.println(a);
     }


    }
}
