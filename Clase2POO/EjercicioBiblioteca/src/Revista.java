import java.util.Date;

public class Revista extends Biblioteca{

    private int numero;

    public Revista(int codigo, String titulo, Date anioPublicacion, int paramNumero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = paramNumero;
    }

    @Override
    public String toString(){
        return super.toString() + " numero ->  "+this.numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
