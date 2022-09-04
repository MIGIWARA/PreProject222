package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarDaoImpl implements CarDao{
    private static String[] models = {"Women1", "Women2", "Women3", "Women4", "Women5", "Women6", "Women7", "Women8"};
    private static String[] transmissions = {"ChexolBigWall", "ChexolSmallWall", "ChexolDeep"};

    private static List<Car> cars = new ArrayList<>();
    static {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setModel(models[random.nextInt(8)]);
            car.setTransmission(transmissions[random.nextInt(3)]);
            car.setEngineOutput(random.nextInt(150));
            cars.add(car);
            System.out.println("Car ύκηεμολÿπ " + (i + 1));
        }
    }
    @Override
    public List<Car> getCarList(int count) {
        if (count == 5) return cars;
        List<Car> list = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
