package transport;

import transport.driver.Driver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>(Arrays.asList());
    private final Set<Mechanic<?>> mechanics= new HashSet<>(Arrays.asList());
    private final Set<Sponsor> sponsors =new HashSet<>(Arrays.asList());


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public  void  addDrivers(Driver<?>...drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }  public  void  addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public  void  addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void start();

    public abstract void stop();
    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();
}