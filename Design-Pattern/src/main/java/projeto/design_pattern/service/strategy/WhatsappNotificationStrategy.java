package projeto.design_pattern.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projeto.design_pattern.service.NotificationStrategy;

public class WhatsappNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(WhatsappNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Whatsapp [{}]", message, destination);
    }
}
