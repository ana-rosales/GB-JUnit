
package passwordvalidator.entidades;

/**
 *
 * @author Ana Paula
 */
public class Validador {
    //contraseña
    //valido
    private String contrasenia;
    private int fortaleza;

    public Validador(String contrasenia) {
        this.contrasenia = contrasenia;
    }
 
    public Validador() {
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }
    
    /**
     * Método que verifique la fortaleza de una
     * contraseña según ciertas reglas (por ejemplo, longitud mínima, presencia
     * de caracteres especiales, letras mayúsculas, etc.).
     * @return 
     */
    public int validar(){
        if(contrasenia.length() >= 8){
            setFortaleza(getFortaleza() + 1);
        }
        
        if(hasEspeciales()){
            setFortaleza(getFortaleza() + 1);
        }
        
        if(hasMayus()){
            setFortaleza(getFortaleza() + 1);
        }
        
        return getFortaleza();
    }
    
    public boolean hasEspeciales(){
        if(contrasenia.contains("\"") || contrasenia.contains("#") || contrasenia.contains("!") ||
           contrasenia.contains("°") || contrasenia.contains("|") || contrasenia.contains("$") ||
           contrasenia.contains(")") || contrasenia.contains("=") || contrasenia.contains("?") ||
           contrasenia.contains("'") || contrasenia.contains("\\") || contrasenia.contains("¡") ||
           contrasenia.contains("¿") || contrasenia.contains("¨") || contrasenia.contains("~") ||
           contrasenia.contains("´") || contrasenia.contains("+") || contrasenia.contains("*") ||
           contrasenia.contains("[") || contrasenia.contains("]") || contrasenia.contains("{") ||
           contrasenia.contains("}") || contrasenia.contains("^") || contrasenia.contains("`") ||
           contrasenia.contains("-") || contrasenia.contains("_") || contrasenia.contains(",") ||
           contrasenia.contains(";") || contrasenia.contains(".") || contrasenia.contains(":") ||
           contrasenia.contains("%") || contrasenia.contains("/") || contrasenia.contains("(")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hasMayus(){
        if(contrasenia.contains("Z") || contrasenia.contains("A") || contrasenia.contains("B") || contrasenia.contains("C") ||
                contrasenia.contains("D") || contrasenia.contains("E") || contrasenia.contains("F") ||
                contrasenia.contains("G") || contrasenia.contains("H") || contrasenia.contains("I") ||
                contrasenia.contains("J") || contrasenia.contains("K") || contrasenia.contains("L") ||
                contrasenia.contains("M") || contrasenia.contains("N") || contrasenia.contains("Ñ") ||
                contrasenia.contains("O") || contrasenia.contains("P") || contrasenia.contains("Q") ||
                contrasenia.contains("R") || contrasenia.contains("S") || contrasenia.contains("T") ||
                contrasenia.contains("U") || contrasenia.contains("V") || contrasenia.contains("W") ||
                contrasenia.contains("X") || contrasenia.contains("Y")){
           return true;
        } else {
            return false;
        }
    }

  
}
