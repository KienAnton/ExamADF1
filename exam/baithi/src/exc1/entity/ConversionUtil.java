package exc1.entity;

public class ConversionUtil {

    public double fahrenheitToCelsius(double fDegree){
        return (5.0 / 9) * (fDegree - 32);
    }

    public double celciusToFahrenheit(double cDegree){
        return (9.0 / 5) * cDegree + 32;
    }
}
