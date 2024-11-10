public class str {
 
    public static void main(String[] args) {
        String text = "Have a nice day!";

        System.out.println("The desbetreffende scentence is: "+text);

        //a
        int length = text.length();
        System.out.println("Number of characters: "+length);
        //b
        System.out.println("First 9 characters: "+text.substring(0, 9));
        //c
        System.out.println("Scentence ends with \"day!\" : "+text.endsWith("day!"));
        //d
        boolean notemptyness = false;
        if (text.length() > 0){
            notemptyness = true;
        }
        System.out.println("Text is not empty: "+notemptyness);
        //e
        System.out.println("Last occurance of \"e\": "+text.lastIndexOf("e"));
        //f
        StringBuilder newtext = new StringBuilder(text);
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)== ' '){
                newtext.setCharAt(i, '-');
        }
        }
        System.out.println("Spaces replaced by hyphens: "+newtext);
        //g
        System.out.println("In upper case: "+text.toUpperCase());
}}