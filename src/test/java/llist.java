import java.util.LinkedList;

public class llist {
    public static void main(String[] args){
        LinkedList <Integer> weight=new LinkedList<>();
        weight.add(10);
        weight.add(1,20);
        weight.addLast(30);
        weight.addFirst(30);
        for(int a:weight){
            System.out.println(a);
        }

    }
}
