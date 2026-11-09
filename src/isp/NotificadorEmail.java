package isp;

public class NotificadorEmail implements Notificavel {
    @Override
    public void notificar(String destino, String mensagem) {
        System.out.println("[Email -> " + destino + "] " + mensagem);
    }
}
