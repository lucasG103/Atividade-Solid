package dip;

public class SmsNotificador implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS -> " + destino + "] " + mensagem);
    }
}
