public class TemperartureTest {
    public static void main(String[] args) {
        System.out.println("Temperature in Celcius in Kelvin and Fahrenheit");
        System.out.println(Temperature.CelciusToKelvin(25)+","+Temperature.CelciusToFahrenheit(25));

        System.out.println("Temperature in Fahrenheit in Kelvin and Celcius");
        System.out.println(Temperature.FahrenheitToKelvin(100)+","+Temperature.FahrenheitToCelcius(100));

        System.out.println("Temperature in Kelvin in Celcius and Fahrenheit");
        System.out.println(Temperature.KelvinToCelcius(0)+","+Temperature.KelvinToFahrenheit(0));
    }
}
