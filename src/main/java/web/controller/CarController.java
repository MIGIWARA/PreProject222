package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars", produces = {"application/xml;charset=UTF-8"})
    public String printCarList(@RequestParam(required = false) Integer count, ModelMap modelMap) {
        CarService carService =  new CarServiceImpl();
        if(count == null) {
            count = 5;
        }
        List<Car> cars = carService.getCarList(count);
        modelMap.addAttribute("cars",cars);
        return "car";
    }
}
