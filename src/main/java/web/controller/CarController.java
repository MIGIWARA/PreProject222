package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carServiceImpl = carService;
    }

    @GetMapping(value = "/cars", produces = {"application/xml;charset=UTF-8"})
    public String printCarList(@RequestParam(defaultValue = "5") int count, ModelMap modelMap) {
        List<Car> cars = carServiceImpl.getCarList(count);
        modelMap.addAttribute("cars", cars);
        return "car";
    }

}
