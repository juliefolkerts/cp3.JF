public class Hoofd {
    public static void main(String[] args) {
        Writer writer = new Writer("Arnon", "Grunberg");
        Boek boek =  new Boek(writer, "Tirza", "Uitgeverij ei");
        boek.display();
        System.out.println();
        Eboek eboek = new Eboek("GoudenEi.dox", writer, "Het Gouden Ei", "Uitgeverij ei");
        eboek.display();
        System.out.println();
        Audioboek audioboek = new Audioboek(123, 5, writer, "Somberman's actie", "Uitgeverij ei");
        audioboek.display();
        System.out.println();

        Bieb bieb = new Bieb(3);
        bieb.addBoek(boek);
        bieb.addBoek(audioboek);
        bieb.addBoek(eboek);
        bieb.display();
    }
}
