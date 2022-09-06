package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDaoImpl carDaoImpl;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDaoImpl = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        System.out.println("Done");
        count = count < 5 && count > 0 ? count : 5;
        return carDaoImpl.getCarList(count);
    }
}
