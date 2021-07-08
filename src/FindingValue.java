import java.util.Scanner;
import java.util.ArrayList;

public class FindingValue {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        int response;

        numList.add(34);
        numList.add(39);
        numList.add(44);
        numList.add(11);
        numList.add(24);
        numList.add(50);
        numList.add(11);

        System.out.println(numList);
        System.out.println("Pick an integer between 1 and 50");

        response = kb.nextInt();
        System.out.println("Value to find: " + response);

        numList.indexOf(response);

        if (numList.indexOf(response) >= 0)
        {
            System.out.printf("%d is in the array list", response);
        }





    }


}
