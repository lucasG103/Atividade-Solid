package dip;

public class WhatsAppNotificador implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[WhatsApp -> " + destino + "] " + mensagem);
    }
}
