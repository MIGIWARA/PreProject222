package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private static final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCarList(int count) {
        System.out.println("Done");
        count = count < 5 && count > 0 ? count : 5;
        return carDao.getCarList(count);
    }
}
