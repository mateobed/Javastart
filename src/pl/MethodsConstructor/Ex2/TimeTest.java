package pl.MethodsConstructor.Ex2;

public class TimeTest {
    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();
        int hours = 14;
        int minutes = converter.hoursToMinutes(hours);
        int seconds = converter.minutesToSeconds(minutes);
        int millis = converter.secondsToMilliseconds(seconds);
        int ms = converter.secondsToMilliseconds(converter.minutesToSeconds(converter.hoursToMinutes(hours)));

        System.out.println(hours + "godzin to: " + minutes + " minut,  " + seconds
                +" sekund, " + millis + " milisekund");

        System.out.println(hours + " godzin to: " + ms + " milisekund");
    }
}
