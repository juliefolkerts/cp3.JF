public class C3 {
    public static boolean isAlphabet(String t){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean answer = true;
        for (int i =0;i<(t.length()-1);i++){
            int j =i+1;
            int letter1 = alphabet.indexOf(t.charAt(i));
            int letter2 = alphabet.indexOf(t.charAt(j));
            if (letter1>letter2){
                answer =false;
                break;
            }
        }
        return answer;
    }
    public static String hideText(String t){
        String[] stars = new String[(t.length()-1)];
        for (int i=1;i<t.length()-1;i++){
            stars[i]="*";
        }
        return t.charAt(0)+stars.toString()+t.charAt(t.length());

    }
}
