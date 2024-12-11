//package 10-Test2;

public class C3 {
    private String filename;

    public C3(String filename) {
        this.filename = filename;
    }
    public String m1(){
        int doti = filename.lastIndexOf('.');
        return filename.substring(0, doti);
    }
    public String m2(){
        int doti = filename.lastIndexOf('.');
        return filename.substring(doti, filename.length());
    }
    
}
