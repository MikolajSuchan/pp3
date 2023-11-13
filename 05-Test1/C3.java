public class C3 {

    public static boolean isAlphabet(String t){
        for (int i = 0; i < t.length() - 1; i++) {
            if (t.charAt(i) > t.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static String hideText(String t){
        if (t.length() <= 2) {
            return t;
        } else {
            char firstChar = t.charAt(0);
            char lastChar = t.charAt(t.length() - 1);
            String middleAsterisks = "*".repeat(t.length() - 2);
            return firstChar + middleAsterisks + lastChar;
        }
    }
}
