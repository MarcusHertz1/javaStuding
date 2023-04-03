package code.hw10.T1;

public class WordWithNumber {

    private static  String numberOfDoc = "";

    public WordWithNumber(String numberOfDoc) {
        WordWithNumber.numberOfDoc = numberOfDoc;
    }

    public static char[] numberBlock() {
        char[] numberBlock = new char[8];
        numberOfDoc.getChars(0, 4, numberBlock, 0);
        numberOfDoc.getChars(9, 13, numberBlock, 4);
        return numberBlock;
    }

    public static StringBuilder changeChars () {
        StringBuilder changeChars = new StringBuilder(numberOfDoc);
        for (int i = 5; i < 8; i++) {
            changeChars.setCharAt(i, '*');
        }
        for (int i = 14; i < 17; i++) {
            changeChars.setCharAt(i, '*');
        }
        return changeChars;
    }

    public static String onlyDownLetters () {
        return numberOfDoc.substring(5, 8) + "/" + numberOfDoc.substring(14, 17) + "/" + numberOfDoc.substring(19, 20) + "/" + numberOfDoc.substring(21);
    }

    public static String onlyUpLetters () {
        StringBuilder onlyUpLetters = new StringBuilder("Letters:");
        onlyUpLetters.append(numberOfDoc.substring(5, 8)).append("/").append(numberOfDoc.substring(14, 17)).append("/").append(numberOfDoc.substring(19, 20)).append("/").append(numberOfDoc.substring(21));
        return String.valueOf(onlyUpLetters);
    }

    public static boolean findSubsequenceABC () {
        return numberOfDoc.contains("abc") || numberOfDoc.contains("ABC");
    }

    public static boolean findSubsequence555 () {
        return numberOfDoc.startsWith("555");
    }

    public static boolean findSubsequence1a2b () {
        return numberOfDoc.endsWith("1a2b");
    }
}
