
import java.util.List;

public class Comensal implements Runnable{
    private String nombre;
    List<Magdalena> mesa;
    public Comensal(String nombre, List<Magdalena> mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while(mesa.size() > 0) {
            System.out.println(nombre + " ha cogido una magdalena");
            mesa.remove(0);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " se ha terminado de comer una magdalena");
        }
    }
}
