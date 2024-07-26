package projeto.design_pattern.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
