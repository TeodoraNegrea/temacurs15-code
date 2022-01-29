package ex1;

public class Degrees {
    public static double fahrenheitToCelsius(double temperature){
        return ((5.0 / 9.0) * (temperature - 32));

    }
    public static double celsiusToFahrenheit(double temperature){
        return (temperature * (9.0/5.0) + 32);
    }
}
