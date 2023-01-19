import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Magdalena> mesa = new ArrayList<Magdalena>();
        for (int i = 0; i < 15; i++) {
            mesa.add(new Magdalena());
        }

        Thread comensal1 = new Thread(new Comensal("Eduardo", mesa));
        Thread comensal2 = new Thread(new Comensal("Gabri", mesa));
        Thread comensal3 = new Thread(new Comensal("Dario", mesa));

        comensal1.setPriority(1);
        comensal2.setPriority(5);
        comensal3.setPriority(10);

        comensal1.start();
        comensal2.start();
        comensal3.start();

    }
}
