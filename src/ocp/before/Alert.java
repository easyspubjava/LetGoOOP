package ocp.before;

public class Alert {

    private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long duration) {

        long tps = requestCount / duration;
        long errorRate = errorCount / requestCount;

        if (tps > rule.getMatchedRuleCount(api)) {
            notification.notify(NotificationEmergencyLevel.URGENCY, tps);
        }

        if (errorRate > rule.getMatchedRuleCount(api)) {
            notification.notify(NotificationEmergencyLevel.SEVERE, errorRate);
        }
    }
}
