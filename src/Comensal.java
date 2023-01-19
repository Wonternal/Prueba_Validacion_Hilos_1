
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

    }
}
