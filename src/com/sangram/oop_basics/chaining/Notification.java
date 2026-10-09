package com.sangram.oop_basics.chaining;

public class Notification {
    private String notificationId;
    private String recipient;
    private String message;
    private String priority;

    public Notification(String notificationId, String recipient, String message, String priority) {
        this.message = message;
        this.notificationId = notificationId;
        this.priority = priority;
        this.recipient = recipient;
    }

    public Notification(String recipient, String message) {
        this("NOTIF-" + System.currentTimeMillis(), recipient, message, "MEDIUM");
    }

    public Notification(String message) {
        this("admin@system.com", message);
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Notification {" + "\n" +
                "  id        = '" + notificationId + "',\n" +
                "  recipient = '" + recipient + "',\n" +
                "  message   = '" + message + "',\n" +
                "  priority  = '" + priority + "'\n" +
                '}';
    }
}
