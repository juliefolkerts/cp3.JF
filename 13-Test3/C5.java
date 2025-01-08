//13-Test3;

import java.util.ArrayList;

public class C5 {
    private String[] cities;

    public C5(String[] cities) {
        this.cities = cities;
    }

    public String[] filter(char c){
        ArrayList<String> filtered = new ArrayList<>();
        for(String city : this.cities){
            if (city.charAt(0)==c){
                filtered.add(city);
            }
        }
        String[] filteredArr = filtered.toArray(new String[0]);
        return new C5(filteredArr);
    }

    public String citiess(){
        StringBuilder answer = new StringBuilder();
        for(String city : this.cities){
            answer.append(city);
        }
        return answer.toString();
    }

}
