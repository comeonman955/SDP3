import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature);
}

// Subject Class (WeatherStation)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Concrete Observer (MobileApp)
class MobileApp implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("MobileApp: Temperature updated to " + temperature);
    }
}

// Concrete Observer (WebDashboard)
class WebDashboard implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("WebDashboard: Temperature updated to " + temperature);
    }
}



