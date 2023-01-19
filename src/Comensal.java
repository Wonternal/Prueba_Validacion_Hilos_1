
import java.util.List;

public class Comensal extends Thread implements Runnable{
    private String nombre;
    List<Magdalena> mesa;
    public Comensal(int priority, String nombre, List<Magdalena> mesa) {
        this.nombre = nombre;
        this.setPriority(priority);
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while(mesa.size() > 0) {
            System.out.println(nombre + " ha cogido una magdalena");
            mesa.remove(0);
            try {
                this.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " se ha terminado de comer una magdalena");
        }
    }
}
