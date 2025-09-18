import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[]args){
        LinkedList <String> player=new LinkedList<>();

        player.add("msd");
        player.add("vaibhav");
        player.add("Ganesh");
        player.add("Aslam");
        System.out.println("Player Name is:"+player);


        player.addFirst("Siddharth");
        System.out.println("After Adding First New Element:"+player);

        player.addLast("xyz");
        System.out.println("After Adding Last element:"+player);

        player.get(1);
        System.out.println(player);
    }

}
