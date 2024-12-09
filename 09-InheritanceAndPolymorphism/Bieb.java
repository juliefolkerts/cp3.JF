public class Bieb {
    private Boek[] boeken;
    private int count;

    public Bieb(int size) {
        this.boeken = new Boek[size];
        count = 0;
    }

    public void addBoek(Boek boek){
        boeken[count] = boek;
        count ++;
    }
    public void display(){
        System.out.println("\nLibrary contains:\n");
        for (Boek b : boeken){
            b.display();
        }
    }

    

}
