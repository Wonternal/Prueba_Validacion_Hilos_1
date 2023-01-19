import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //A veces funciona y a veces no, ejecutar varias veces

        List<Integer> califications = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            int randomCalification = (int) (Math.random() * 10);
            califications.add(randomCalification);
        }

        List<String> mensajes = new ArrayList<>();
        HiloProcesadorNota hilo1 = new HiloProcesadorNota(califications, 1, mensajes);
        HiloProcesadorNota hilo2 = new HiloProcesadorNota(califications, 2, mensajes);
        HiloProcesadorNota hilo3 = new HiloProcesadorNota(califications, 3, mensajes);
        HiloProcesadorNota hilo4 = new HiloProcesadorNota(califications, 4, mensajes);
        HiloProcesadorNota hilo5 = new HiloProcesadorNota(califications, 5, mensajes);
        HiloProcesadorNota hilo6 = new HiloProcesadorNota(califications, 6, mensajes);
        HiloProcesadorNota hilo7 = new HiloProcesadorNota(califications, 7, mensajes);
        HiloProcesadorNota hilo8 = new HiloProcesadorNota(califications, 8, mensajes);
        HiloProcesadorNota hilo9 = new HiloProcesadorNota(califications, 9, mensajes);
        HiloProcesadorNota hilo10 = new HiloProcesadorNota(califications, 10, mensajes);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
            hilo6.join();
            hilo7.join();
            hilo8.join();
            hilo9.join();
            hilo10.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Acabaron todos los hilos " + mensajes.size());

        Integer sumaTotalHilos = 0;
        for (int i = 0; i < mensajes.size(); i++) {
            System.out.println(mensajes.get(i));
            sumaTotalHilos += Integer.parseInt(mensajes.get(i).substring(mensajes.get(i).length() - 5));
        }
        float mediaHilos = (float) sumaTotalHilos / califications.size();
        System.out.println(mediaHilos);
        //A veces funciona y a veces no, ejecutar varias veces
    }
}
