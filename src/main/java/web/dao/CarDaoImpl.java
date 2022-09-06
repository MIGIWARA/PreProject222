package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CarDaoImpl implements CarDao {
    private static String[] models = {"Mercedes", "BMW", "Mazda", "KIA", "Toyota"};
    private static String[] transmissions = {"transmission1", "transmission2", "transmission3"};

    private static List<Car> cars = new ArrayList<>();

    static {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setModel(models[random.nextInt(5)]);
            car.setTransmission(transmissions[random.nextInt(3)]);
            car.setEngineOutput(random.nextInt(150));
            cars.add(car);
            System.out.println("Car number " + (i + 1));
        }
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 5) return cars;
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
