
package discountcalculator.entidades;

/**
 *
 * @author Ana Paula
 */
public class CalculadoraDescuentos {
    //que necesita un descuento
    //el precio original
    //la porcentaje de descuento
    //el precio descontado
    private double pOriginal;
    private double pDescuento;
    private double pFinal;

    public CalculadoraDescuentos() {
    }

    public CalculadoraDescuentos(double pOriginal, double pDescuento) {
        this.pOriginal = pOriginal;
        this.pDescuento = pDescuento/100; //si es %10 = .10
    }

    public double getpOriginal() {
        return pOriginal;
    }

    public void setpOriginal(double pOriginal) {
        this.pOriginal = pOriginal;
    }

    public double getcDescuento() {
        return pDescuento;
    }

    public void setcDescuento(double cDescuento) {
        this.pDescuento = cDescuento/100;
    }

    public double getpFinal() {
        return pFinal;
    }
    
    public double calcularDescuento(){
        //decuento = precio original * porcentaje de descuento
        double descuento = pOriginal * pDescuento;
        //precio descontado = precio otiginal - descuento
        pFinal = pOriginal - descuento;
        return pFinal;
    }
}
