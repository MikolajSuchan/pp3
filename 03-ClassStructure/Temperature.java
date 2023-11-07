public class Temperature {

    static double  CelciusToKelvin(double temp){
        return temp+273.5; 
    }

    static double KelvinToCelcius(double temp){
        return temp-273.5;
    }

    static double CelciusToFahrenheit(double temp){
        return 32+((9f/5f)*temp);
    }

    static double FahrenheitToCelcius(double temp){
        return (5f/9f)*(temp-32);
    }

    static double KelvinToFahrenheit(double temp){
        return 32+((9f/5f)*(temp-273.5));
    }

    static double FahrenheitToKelvin(double temp){
        return (5f/9f)*((temp-27.3)-32);
    }

}
