//package 10-Test2;

import java.util.ArrayList;

public class Cities {
    private String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }
    public ArrayList<String> filter(char letter){
        ArrayList<String> answer = new ArrayList<>();
        for (String city : cities){
            if (city.charAt(0) == letter){
                answer.add(city);
            }
        }
        return answer;
    }
    public String cities(){
        StringBuilder answer = new StringBuilder();
        answer.
    }


}
