public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileApp = new MobileApp();
        Observer webDashboard = new WebDashboard();

        weatherStation.addObserver(mobileApp);
        weatherStation.addObserver(webDashboard);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);
    }
}