package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();
    public CarService() {
        cars.add(new Car("Camry", "White", 25000));
        cars.add(new Car("Corolla", "Black", 23000));
        cars.add(new Car("Land Cruiser", "Yellow", 35000));
        cars.add(new Car("Prado", "Green", 30000));
        cars.add(new Car("Prius", "Gray", 15000));
    }

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }


}
