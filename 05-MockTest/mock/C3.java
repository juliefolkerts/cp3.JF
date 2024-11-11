

public class C3 {
    static String alfabet = "abcdefghijklmnopqrstuvwxyz";
    static boolean isAlphabet(String t){
        //String alfabet = "abcdefghijklmnopqrstuvwxyz";
        boolean answer = false;
        for (int i = 0;i <t.length()-1;i++){
            char letter1 = t.charAt(i);
            char letter2 = t.charAt(i+1);
            if (alfabet.indexOf(letter1)>alfabet.indexOf(letter2)){
                answer = false;
                //break;
            }
            break;
        }
        return answer;
    } 
    static String hideText(String t){
        String emp = "";
        StringBuilder answer = new StringBuilder(emp);
        answer.append(t.charAt(0));
        for (int i=1;i<t.length()-1;i++){
            answer.append("*");
        }
        answer.append(t.charAt(t.length()));
        return emp;
    }
}
