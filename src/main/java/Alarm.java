public class Alarm {

//    public static String people(int p) {
//
//        if (p <= 30 && p >= 0) {
//            return ("Maximale Personenzahl nicht überschritten.");
//        } else if (p < 0) {
//            return ("ERROR!");
//        } else {
//            return ("ALARM!!! Zu viele Personen!");
//        }
//    }

    static String level = "green";

    static String levelWarning(int p, String Level) {
        if (level.equals("red") && (p>0)) {
            return "Alarm!!! Stufe Rot erreicht! Keine weiteren Personen erlaubt.";
        } else if (level.equals("yellow") && (p<=30)) {
            return "Stufe Gelb! Es dürfen noch " + (30-p) + " Personen eintreten.";
        } else if (level.equals("green") && (p<=60)) {
            return "Stufe Grün! Es dürfen noch " + (600-p) + " Personen eintreten.";
        } else {
            return "ERROR";
        }
    }
}
