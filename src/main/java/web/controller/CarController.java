package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(name = "count", required = false, defaultValue = "5") Integer count) {
        List<Car> cars = carService.getCars(count);
//        System.out.println(cars);
        model.addAttribute("cars", cars);
        System.out.println(model.getAttribute("cars"));;
        return "cars";
    }
}
