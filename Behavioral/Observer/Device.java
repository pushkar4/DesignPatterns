
public class Device implements IObserver {
	
	private String name;
	private WeatherStation station;
	
	public Device(String name, WeatherStation station) {
		this.name = name;
		this.station = station;	
	}

	@Override
	public void update() {
		
		System.out.println("Device      : " + name);
		System.out.println("Temperature : " + station.getTemperature());
		System.out.println("Humidity    : " + station.getHumidity());
		System.out.println("Wind        : " + station.getWind());
		System.out.println();
	}

}
