import java.util.Date;

public class Libros extends Biblioteca implements IPrestable{
    
    private boolean prestado;

    public Libros(int codigo, String titulo, Date anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString(){
        return super.toString() + " prestado ->  "+this.prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar(String argumento) {
        
    }

    @Override
    public String devolver(String paramPersona) {
        return "Gracias "+paramPersona;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }

    
}
