package test;

/**
 * @author hochean
 */
public class LiWei {

    private String a;

    public static void main(String[] args) {

        String s = "abc";
        switch (s){
            case "a": {s = "bc"; break;}
            case "abc":{s="a";break;}
        }
        System.out.println(s);
    }

}
