package hackerrank;

public class StringRev {

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(revert(s));
    }

    private static String revert(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char aux = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = ch[i];
            ch[i] = aux;
        }
        return new String(ch);
     }

}
