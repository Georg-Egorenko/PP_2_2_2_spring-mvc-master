package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars =  new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("Camry", "White", 25000));
        cars.add(new Car("Corolla", "Black", 23000));
        cars.add(new Car("Land Cruiser", "Yellow", 35000));
        cars.add(new Car("Prado", "Green", 30000));
        cars.add(new Car("Prius", "Gray", 15000));
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            count = cars.size();
        }
        return new ArrayList<>(cars.subList(0, count));
    }

}

