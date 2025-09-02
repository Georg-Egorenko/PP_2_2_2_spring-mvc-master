package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {this.carDao = carDao;}

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carDao.getAllCars();
        }
        return carDao.getCars(count);
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
