package code.hw10;

/*
Дана строка произвольной длины.
Написать программу для проверки является ли заданная строка палиндромом.
(abba - является, abbb - не является)
*/

public class AT1 {
    public static void main(String[] args) {

        String str1 = "abfgba";
        StringBuilder str = new StringBuilder(str1);
        str.reverse();
        String str2 = str.toString();
        if(str1.equals(str2)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String isn't palindrome");
        }
    }
}
