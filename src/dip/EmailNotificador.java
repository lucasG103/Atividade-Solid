package dip;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[Email -> " + destino + "] " + mensagem);
    }
}
