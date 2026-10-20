import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // String name = "Sarthak";
        // String fullName = "Sarthak Arora";
        // String sentence = "My name is Sarthak Arora";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // // for complete line use sc.nextLine
        // System.out.println("My name is " + name);

        // concetenation 

        // String firstName = "Sarthak";
        // String lastName = "Arora";
        // String name = firstName+" "+lastName;
        // System.out.println(name);
        // System.out.println(name.length());

        // // charAt(like array string character also have indexes which can be used by function charAt)

        // for(int i =0; i<name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }



        // comparing strings
        String name1 = "Sarthak";
        String name2 = "Sarthak";

        //1 s1>s2 : +ve value(alphabetically then number of characters)
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value
        // System.out.println(name1.compareTo(name2));
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are unequal");
        // }


        // if (name1==name2) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are unequal");
        // }


        // if(new String("Sarthak")== new String("Sarthak")){//Doesn't work if string is defined like this
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are unequal");
        // }

        String sentence = "My name is Sarthak";
        // substring(beg index, end index)
        String name = sentence.substring(11);

        System.out.println(sentence);
        System.out.println(name);

    }
}
