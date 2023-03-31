package sec05.exam06;

public class EarthExample {

	public static void main(String[] args) {
		System.out.printf("Radius of earth : %.1fkm\n", Earth.EARTH_RADIUS);
		System.out.println("Area of Earth : " + Earth.EARTH_AREA + "km^2");
		System.out.printf("Area of earth : %Ekm^2\n", Earth.EARTH_AREA);
	}
}