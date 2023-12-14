import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLisst {
    public static void main(String[] args) {
        //int[] arr = new int[3];
//        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();  // Declaration
        ArrayList <Integer> list2 = new ArrayList<>();  // Declaration


        list.add(10);
        list.add(15);
        list.add(20);
        list.add(12);
        list.add(19);

        System.out.println(list);

        list2 = list;

        Collections.reverse(list);

        System.out.println(list);

        if (list.equals(list2)==true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }



//        int value;
//        for (int i = 0; i<5; i++){     // Taking input from keyboard
//            value = sc.nextInt();
//            list.add(value);
//        }

//        list.remove(1);  //removing elements
//
//        System.out.println(list);
//
//        System.out.println(list.get(3));  //getting a specified element


//        list2.add(10);
//        list2.add(15);
//        list2.add(20);
//        list2.add(12);
//        list2.add(19);
//
//        System.out.println(list2);
//
//        System.out.println(list.equals(list2));

        list.clear();
        System.out.println(list);

    }
}
