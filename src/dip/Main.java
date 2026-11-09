package dip;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificacaoService completo = new NotificacaoService(
            List.of(new EmailNotificador(), new SmsNotificador(), new WhatsAppNotificador()));
        completo.notificarTodos("cliente1", "Pedido confirmado.");

        NotificacaoService somenteWhatsApp = new NotificacaoService(List.of(new WhatsAppNotificador()));
        somenteWhatsApp.notificarTodos("cliente1", "Pedido em preparo.");
    }
}
