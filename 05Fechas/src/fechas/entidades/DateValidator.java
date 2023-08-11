package fechas.entidades;

/**
 * Crea una clase DateValidator que valide la corrección de una fecha (por
 * ejemplo, si es una fecha válida en el calendario gregoriano).
 *
 * @author Ana Pau
 */
public class DateValidator {
    
    private String[] fecha;
    private boolean valida;
    private int dia;
    private int mes;
    private int anio;

    public DateValidator() {
    }

    public DateValidator(String fecha) {
        this.fecha = fecha.split("/");
        validar();
    }

    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void validar() {
        dia = mes = anio = 0;
        valida = true;

        //validar que sí sea una fecha
        if (fecha.length != 3) {
            valida = false;
            System.out.println("Fecha inváilda.");
        } else {
            dia = Integer.parseInt(fecha[0]);
            mes = Integer.parseInt(fecha[1]);
            anio = Integer.parseInt(fecha[2]);
            //validar día mes menor a 12
            if (mes < 1 || mes > 12) {
                valida = false;
                System.out.println("Mes inválido.");
            } //validar dia menor a 30,31 o 28
            else if (tiene31dias(mes)) {
                if (dia < 1 || dia > 31) {
                    valida = false;
                    System.out.println("Dia inválido.");
                }
            }  else if (esBisiesto(anio)){
                if(dia <1 || dia > 29){
                System.out.println("Dia invalido es año bisiesto.");
                }
            } else if (mes == 2) {
                if (dia < 1 || dia > 28) {
                    valida = false;
                    System.out.println("Dia inválido.");
                }
            } else {
                if (dia < 1 || dia > 30) {
                    valida = false;
                    System.out.println("Dia inválido.");
                }
            }
        }
    }
    
    public static boolean tiene31dias(int mes) {
        boolean tiene31dias;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            tiene31dias = true;
        } else {
            tiene31dias = false;
        }
        return tiene31dias;
    }
    
    public static boolean esBisiesto(int anio){
        boolean bisiesto = false;
        if(anio%4 == 0){
            if(anio%100 == 0){
                if(anio%400 == 0){
                    bisiesto = true;
                }
            }
        }
        return bisiesto;
    }
}
