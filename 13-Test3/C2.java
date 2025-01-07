//13-Test3;

public class C2 {
    static boolean Iso(String text){
        for (int i=0;i<text.length()-1;i++){
            for (int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j) && text.charAt(i) != ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Iso("BLUE water"));
        System.out.println(Iso("blue water"));
    }
}

