
import java.util.*;
import java.util.stream.Collectors;

public class ArraylistDemo2 {
    public static void main(String[]args){
        ArrayList <String> players=new ArrayList<>();


        players.add("M.S.Dhoni");
        players.add("Sachin tendulkar");
        players.add("Ruturaj Gaikwad");
        players.add("Ravindra jadeja");
        players.add("M.S.Dhoni");


        ArrayList<Integer> demo=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(5);
        demo.add(2);

       List<Integer>al= demo.stream().sorted(Collections.reverseOrder()) .collect(Collectors.toList());
        System.out.println(al );




        System.out.println("This is MY fevrate Cricket Players:"+players);

        if (players.contains("Sachin tendulkar")){
            System.out.println("This is Present");

        }
        else {
            System.out.println("this plyaer is not present");
        }
    }

}
