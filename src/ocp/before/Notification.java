package ocp.before;

public class Notification {

    public void notify(String urgency, long tps) {
        System.out.println("NotificationEmergencyLevel: " + urgency + ", tps: " + tps);
    }

}
