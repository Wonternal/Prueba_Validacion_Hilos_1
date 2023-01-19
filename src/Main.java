import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Magdalena> mesa = new ArrayList<Magdalena>();
        for (int i = 0; i < 15; i++) {
            mesa.add(new Magdalena());
        }

        Comensal comensal1 = new Comensal(1, "Eduardo", mesa);
        Comensal comensal2 = new Comensal(5, "Gabri", mesa);
        Comensal comensal3 = new Comensal(10, "Dario", mesa);

    }
}
