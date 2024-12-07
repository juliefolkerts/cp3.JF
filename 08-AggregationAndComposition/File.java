public class File{
    private String name;
    private int size;
    private String content;
    
    public File(String name, int size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getContent() {
        return content;
    }
    public void showfile(){
        System.out.println(getContent());
    }
    @Override
    public String toString(){
        return String.format("Name: %s, Size: %d KB", this.name,this.size);
    }
    
}