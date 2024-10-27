public class temp {
    //double degree_C;
    //double degree_K;
    //double degree_F;
    public void Celsius2Kelvin(double degrees){
        double K = degrees+273.15;
        System.out.println("Celsius: "+degrees+" --> Kelvin: "+K);
    }
    public void Celsius2Fahrenheit(double degrees){
        double F = (degrees*1.8)+32;
        System.out.println("Celsius: "+degrees+" --> Fahrenheit: "+F);
    }
    public void Fahrenheit2Celsius(double degrees){
        double C = (degrees-32)/1.8;
        System.out.println("Fahrenheit: "+degrees+" --> Celsius: "+C);
    }
    public void Fahrenheit2Kelvin(double degrees){
        double K = 273.15+((degrees-32)/1.8);
        System.out.println("Fahrenheit: "+degrees+" --> Kelvin: "+K);
    }
    public void Kelvin2Celsius(double degrees){
        double C = degrees - 273.15;
        System.out.println("Kelvin: "+degrees+" --> Celsius: "+C);
    }
    public void Kelvin2Fahrenheit(double degrees){
        double F = ((degrees - 273.15)*1.8)+32;
        System.out.println("Kelvin: "+degrees+" --> Fahrenheit: "+F);
    }
}
