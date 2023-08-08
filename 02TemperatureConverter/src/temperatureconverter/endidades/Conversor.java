
package temperatureconverter.endidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Crea una clase TemperatureConverter que convierta entre diferentes unidades
 * de temperatura (por ejemplo, Celsius, Fahrenheit, Kelvin).
 *
 * @author Ana Paula
 */
public class Conversor {
    //temperatura
    //tipo
    //private static ArrayList<String> temp = new ArrayList<String>( Arrays.asList("C", "F", "E") );
    private double temperatura;
    private String tipo;

    public Conversor() {
    }

    public Conversor(double temperatura, String tipo) {
        this.temperatura = temperatura;
        this.tipo = tipo;
    }
    
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * (°F − 32) × 5/9 = °C
     *  K − 273.15 = °C
     * @return 
     */
    public double aCelsius(){
        double temp = temperatura;
        if(tipo.equals("F")){
            temperatura = (temp - 32) * (5.0/9.0);
        } else if(tipo.equals("K")){
            temperatura = temp - 273.15;
        }
        return temperatura;
    }
    
    /**
     * (°C × 9/5) + 32 = °F
     * (K − 273.15) × 9/5 + 32 = °F
     * @return 
     */
    public double aFarenheit(){
        double temp = temperatura;
        if (tipo.equals("C")) {
            temperatura = (temp * (9.0/5.0)) + 32;
        } else if (tipo.equals("K")) {
            temperatura = (temp - 273.15) * (9.0/5.0) + 32;
        }
        return temperatura;
    }
    
    /**
     * (°F − 32) × 5/9 + 273.15 = K
     *  °C + 273.15 = K
     * @return 
     */
    public double aKelvin(){
        double temp = temperatura;
        if (tipo.equals("F")) {
            temperatura = ((temp - 32) * (5.0 / 9.0)) + 273.15;
        } else if (tipo.equals("C")) {
            temperatura = temp + 273.15;
        }
        return temperatura;
    }
    
}
