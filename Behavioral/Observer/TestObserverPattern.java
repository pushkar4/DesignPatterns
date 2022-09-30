public class TestObserverPattern {

  public static void main(String[] args) {

    WeatherStation station = new WeatherStation();

    Device phone = new Device("Smartphone", station);
    Device clock = new Device("Wallclock", station);

    station.register(phone);
    station.register(clock);

    station.startWeatherWatch();
  }
}
