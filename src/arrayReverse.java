import java.util.*;

public class arrayReverse {
    public static List<String> userArray = new ArrayList<>();

    public static List<String> reverseArray = new ArrayList<>();

    public static String reverseString = "";

    public static void main(String[] args){
        ask();
        reverseString();
        arrayReverse();

    }
    public static void ask(){
        Scanner stringGet = new Scanner(System.in);
        System.out.println("What are the strings you would like to insert and reverse (order and letters)? [COMMA SEPARATED]");
        String userString = stringGet.nextLine();

        userArray = Arrays.asList(userString.split(","));
    }

    public static void reverseString() {


        int arrayLength = userArray.size();

        for (int x = 0; x < arrayLength; x++) {

            String userString = userArray.get(x);

            int stringLength = userString.length();
            int lengthDecreasing = stringLength;

            reverseString = "";

            for (int i = 0; i < stringLength; i++) {


                char userStringChar = userString.charAt(lengthDecreasing - 1);
                reverseString += userStringChar;
                lengthDecreasing--;


            }
            reverseArray.add(reverseString);
        }
    }
    public static void arrayReverse() {

        int arrayLength = reverseArray.size();

        String temp = "";


        for (int i = 0; i < arrayLength / 2 ; i++) {
            temp = reverseArray.get(i);
            reverseArray.set(i, reverseArray.get(arrayLength - (i + 1)));
            reverseArray.set(arrayLength - (i + 1), temp);
            }
        System.out.println(reverseArray);
        }

    }





