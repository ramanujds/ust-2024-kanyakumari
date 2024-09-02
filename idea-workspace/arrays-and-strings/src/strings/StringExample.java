package strings;

public class StringExample {

    public static void main(String[] args) {

        System.out.println("Total Processors : "+Runtime.getRuntime().availableProcessors());

       String str = "UST Global";

       String str2 = " Trivandrum";

       str = str.concat(str2);



        System.out.println(str);


        int a = 10;

        String astr = String.valueOf(a);


        System.out.println(5+6+"3"+1+8);

//       int length = str.length();
//       for (int i=0; i<length; i++){
//           System.out.println(str.charAt(i));
//       }

//       var chars = str.toCharArray();
//
//       for (char ch:chars){
//           System.out.println(ch);
//       }


    }

}
