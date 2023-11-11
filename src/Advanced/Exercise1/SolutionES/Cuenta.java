package Advanced.Exercise1.SolutionES;

/**
 *
 * @author dvchinx
 */
public class Cuenta {
    
    private String titular;
    private float fondos;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    public Cuenta(String titular, float fondos){
        this.titular = titular;
        if(fondos <= 0){
            System.out.println("Error, debes agregar fondos positivos.");
        } else {
            this.fondos = fondos;
        }
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public float getFondos(){
        return fondos;
    }
    
    public void setFondos(float fondos){
        this.fondos = fondos;
    }
    
    public void ingresar(float fondos){
        if(fondos > 0){
            this.fondos += fondos;
        }
    }
    
    public void retirar(float cantidad) {
        if (this.fondos - cantidad < 0) {
            this.fondos = 0;
        } else {
            this.fondos -= cantidad;
        }
    }
        
    @Override
    public String toString() {
        return "El titular " + titular + " tiene " + fondos + " euros en la cuenta";
    }
    
}