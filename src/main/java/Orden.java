
public class Orden {
    
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
    
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite "+ Orden.MAX_COMPUTADORAS);
        }
    }
    
    
    public void mostrarOrden(){
    
        System.out.println("Orden No. "+ this.idOrden);
        System.out.println("Computadoras de la orden No.: " + this.idOrden );
        
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    
    }
    
    
    
    
    
    
    
    
}
