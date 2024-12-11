//package 10-Test2;

public class C5 {
    private String[] words;

    public C5(String[] words) {
        this.words = words;
    }
    public boolean m(){
        for (int i = 0; i<words.length;i++ ){
            for (int j=i+1;j<words.length;j++){
                if (words[i].equals(words[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
