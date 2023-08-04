import java.util.Date;

public class Biblioteca {

    private int codigo;
    private String titulo;
    private Date anioPublicacion;
    
    public Biblioteca(int codigo, String titulo, Date anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String toString(){
        return "codigo  ->  "+this.codigo+" titulo ->  "+this.titulo+ " anioPublicacion ->  "+this.anioPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(Date anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    
}
