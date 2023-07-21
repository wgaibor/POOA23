public class Persona {
    public String nombre;
    public int edad;
    private Long identificacion;
    private Long telefono;
    private String direccion;
    private String nacionalidad;
    private String nivelInstuccion;

    

    public Persona() {
        this.nombre = "Jorge";
        //this.dormir(9);
    }

    public Persona(String name, int age, Long dni, Long phone, String address, String nationatily) {
        this.nombre = name;
        this.edad = age;
        this.identificacion = dni;
        this.telefono = phone;
        this.direccion = address;
        this.nacionalidad = nationatily;
    }

    public String trabajar(String nombreEmpresa){
        return "La persona "+this.nombre+" trabaja en "+nombreEmpresa;
    }

    public String comer(String comida){
        return "La persona comio "+comida;
    }

    public void dormir(int hora){
        int aumentarTiempo = hora + 1;
        System.out.println("Yo me duermo 1 hora mas tarde que tí "+aumentarTiempo);
    }

    public String aprender(String nombreMateria){
        return "Usted esta aprendiendo "+nombreMateria;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNivelInstuccion() {
        return nivelInstuccion;
    }

    public void setNivelInstuccion(String nivelInstuccion) {
        this.nivelInstuccion = nivelInstuccion;
    }

    
    
}
