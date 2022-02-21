
public class Computadora {
    
    private final int idComputadora;
    private String nombre;
    private Monitor monitor1;
    private Teclado teclado1;
    private Raton raton1;
    private static int contadorComputadoras;
    
    private Computadora(){
    
    this.idComputadora = ++Computadora.contadorComputadoras;
    
    }
    
    
    public Computadora(String nombre, Monitor monitor1, Teclado teclado1, Raton raton1 ){
        
        this();
        this.nombre = nombre;
        this.monitor1 = monitor1;
        this.teclado1 = teclado1;
        this.raton1 = raton1;
    
    }

    public int getIdComputadora() {
        return idComputadora;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public Teclado getTeclado1() {
        return teclado1;
    }

    public void setTeclado1(Teclado teclado1) {
        this.teclado1 = teclado1;
    }

    public Raton getRaton1() {
        return raton1;
    }

    public void setRaton1(Raton raton1) {
        this.raton1 = raton1;
    }
    
    

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor1=" + monitor1 + ", teclado1=" + teclado1 + ", raton1=" + raton1 + '}';
    }
    
    
    
    
}
