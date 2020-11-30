package epn.threadsepn;

public class ClsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Principal
        System.out.println("ID del proceso: "+Thread.currentThread().getId()+
                " Nombre: "+Thread.currentThread().getName());        
        System.out.println("Ejecutando proceso 1");
        Hilo hnuevo = new Hilo();
        hnuevo.start();
        System.out.println("Fin del proceso 1");
        System.out.println("Ejecutando proceso 2");
        
    }
    
}
