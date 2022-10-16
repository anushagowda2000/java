class SolarSystemTester{

public static void main(String args[]){

SolarSystem sun = new SolarSystem();
sun.planetName = "earth";
sun.order = "third";
sun.satelitte();

SolarSystem sun1 = new SolarSystem();
sun1.planetName = "mercury";
sun1.order = "first";
sun1.satelitte();

}
}