package epn.threadsepn;

public class Hilo extends Thread {
    
    @Override
    public void run(){
        
        //Paralelo!
        System.out.println("ID del proceso"+Thread.currentThread().getId()+
                "Nombre: "+Thread.currentThread().getName());  
        
        System.out.println("Ejecutando proceso 1");
        Hilo hnuevo = new Hilo();
        hnuevo.start();
        System.out.println("Fin del proceso 1");
        System.out.println("Ejecutando proceso 2");
        
        try{
            Thread.sleep(9000);
        
        }catch(Exception ex){
            
            ex.printStackTrace();
        
        }
        
    }
    
}
