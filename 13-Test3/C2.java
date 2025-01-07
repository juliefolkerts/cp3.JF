//13-Test3;

public class C2 {
    static boolean Iso(String text){
        boolean answer = true;
        for (int i=0;i<text.length()-1;i++){
            for (int j=1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Iso("BLUE water");
        Iso("blue water");
    }
}

