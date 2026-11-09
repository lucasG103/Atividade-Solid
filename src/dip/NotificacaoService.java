package dip;

import java.util.List;

public class NotificacaoService {
    private final List<Notificador> canais;

    public NotificacaoService(List<Notificador> canais) {
        this.canais = List.copyOf(canais);
    }

    public void notificarTodos(String destino, String mensagem) {
        canais.forEach(canal -> canal.enviar(destino, mensagem));
    }
}
