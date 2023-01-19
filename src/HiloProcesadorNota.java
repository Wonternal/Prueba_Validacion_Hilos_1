
import java.util.List;

public class HiloProcesadorNota extends Thread {
    private List<Integer> califications;
    private int id;
    private int sumaTotal = 0;
    private int numVecesSumado = 0;
    private List<String> mensajes;

    public HiloProcesadorNota(List<Integer> califications, int id, List<String> mensajes) {
        this.califications = califications;
        this.id = id;
        this.mensajes = mensajes;
    }

    public void run() {
        for (int i = (id -1) * 10000; i < id * 10000; i++) {
            sumaTotal += califications.get(i);
            numVecesSumado++;
        }

        String mensaje = "El hilo " + id + " que empezó en el indice " + (id -1) * 10000 +  " y ha contado " + numVecesSumado + " calificaciones ha sumado " +
                "un total de " + sumaTotal;
        mensajes.add(mensaje);


        // System.out.println(mensaje);
    }
}
