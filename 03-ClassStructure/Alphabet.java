public class Alphabet {
    public static boolean isAlphabet(String t){
        int length = t.length();
        boolean answer = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0;i<(length-1);i++){
            int j = i+1;
            int letter1 = alphabet.indexOf(t.charAt(i));
            int letter2 = alphabet.indexOf(t.charAt(j));
            if (letter2<letter1){
                answer = false;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String word = "Jj";
        boolean answer = isAlphabet(word);
        System.out.println(word+" is in alphabetical order: "+answer);
    }
}
