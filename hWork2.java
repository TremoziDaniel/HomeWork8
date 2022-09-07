import java.util.Scanner;

 class hWork2 {
    final static Scanner scan = new Scanner(System.in);

     public static void main(String[] args) {
         String str1 = scan.nextLine();
         String str2 = scan.nextLine();
         firstDifference(str1, str2);
     }
     static void firstDifference(String str1, String str2) {
         int smallerLength;
         if (str1.length() > str2.length())
             smallerLength = str2.length();
         else
             smallerLength = str1.length();
         int difVar = smallerLength;

         for (int i = 0; i < smallerLength; i++) {
             if(str1.charAt(i) != str2.charAt(i)) { //Можно ведь обойтись и без toCharArray();
                 difVar = i;
                 break;
             }
         }
         if (difVar == smallerLength && str1.length() == str2.length())
             System.out.println(-1);
         else
             System.out.println(difVar + 1); //Что бы считало не с нуля
     }
}
