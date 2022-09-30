import java.util.LinkedList;
import java.util.Random;

public class WeatherStation implements IObservable {

  private LinkedList<IObserver> observers;
  private float temperature, humidity, wind;
  private Random random;

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getWind() {
    return wind;
  }

  public WeatherStation() {
    observers = new LinkedList<IObserver>();
    random = new Random();
    temperature = humidity = wind = 0.0f;
  }

  @Override
  public void register(IObserver observer) {
    observers.add(observer);
  }

  @Override
  public void unRegister(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {

    System.out.println("Notifying...\n---------------------------");

    for (IObserver observer : observers) {
      observer.update();
    }
  }

  public void startWeatherWatch() {

    Thread t =
        new Thread(
            new Runnable() {

              @Override
              public void run() {

                while (true) {
                  setNewValues();

                  try {
                    Thread.sleep(2000);
                  } catch (InterruptedException e) {
                  }
                }
              }
            });

    t.start();

    try {
      t.join();
    } catch (InterruptedException e) {
    }
  }

  private void setNewValues() {
    temperature = random.nextFloat() * 100;
    humidity = random.nextFloat() * 100;
    wind = random.nextFloat() * 100;
    notifyObservers();
  }
}
