import java.util.ArrayList;

public class Folder{
    private String name;
    private int size;
    private ArrayList<File> files = new ArrayList<>();

    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file){
        files.add(file);
        this.size += file.getSize();
    }
    public void deleteFile(File file){
        files.remove(file);
    }
    public void listFiles(){
        System.out.println("\nFiles in this folder:\n");
        for (File file : files){
            System.out.println(file.toString());
        }
    }

    public static void main(String[] args) {
        Folder folder = new Folder("Folder 1", 0);
        folder.listFiles();

        File fileA = new File("File A", 6, "This is file A.");
        File fileB = new File("File B", 8, "This is file B.");
        fileA.showfile();
        fileB.showfile();

        folder.addFile(fileA);
        folder.addFile(fileB);

        folder.listFiles();

        folder.deleteFile(fileB);
        folder.listFiles();

        fileB.showfile();

    }
}