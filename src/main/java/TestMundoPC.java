
public class TestMundoPC {
    
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 23.25); 
        Raton ratonhp = new Raton("usb","HP");
        Teclado tecladoHP = new Teclado("bluetoh","HP");
        
        Computadora pcEscritorioHP = new Computadora("PC HP DE ESCRITORIO",monitorHP,tecladoHP,ratonhp);
        
        Monitor monitorGamer = new Monitor("Gamer", 40.25); 
        Raton ratonGamer = new Raton("usb3","HP");
        Teclado tecladoGamer = new Teclado("Firewire","Gamer");
        
        Computadora pcGamer = new Computadora("COMPU GAMER",monitorGamer,tecladoHP,ratonGamer);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(pcGamer);
        orden1.agregarComputadora(pcEscritorioHP);
        orden1.agregarComputadora(pcGamer);
        orden1.mostrarOrden();
         
        
        Orden orden2 = new Orden();
        
        orden2.agregarComputadora(pcGamer);
        orden2.agregarComputadora(pcEscritorioHP);
        orden2.agregarComputadora(pcGamer);
        orden2.mostrarOrden();


        
        
    }
    
}
