package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapPractice {


    public static void main(String[] args) {
        String user[] = {"User1", "User2", "User3"};

        ArrayList<Integer> pass = new ArrayList<>();
        pass.add(12345);
        pass.add(23456);
        pass.add(34567);


        String b = "";

        //Hashmap<key , Value>
        HashMap<String, String> userPass = new HashMap<>();
        userPass.put("user1", "pass1");
        userPass.put("user2", "pass2");
        userPass.put("user3", "pass3");

        System.out.println(userPass);

        for (String a: userPass.keySet()
             ) {
            System.out.println(a );
        }
    }


}
