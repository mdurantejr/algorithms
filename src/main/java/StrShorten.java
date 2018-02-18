public class StrShorten {

    public static void main(String[] args) {
        String s = "aabbbcdeeeee"; //a2b3c1d1e5
        new StrShorten().shorten(s);
    }

    private void shorten(String s) {
        char[] charr = s.toCharArray();
        int c = 1;
        char ch = charr[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < charr.length; i++) {
            if (charr[i] == ch) {
                c++;
            } else {
                sb.append(ch);
                sb.append(c);
                c = 1;
            }
            ch = charr[i];
        }
        sb.append(ch);
        sb.append(c);
        System.out.print(sb.toString());
    }

}
