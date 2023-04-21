package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {
    private CarDao carDao;
    private CarService carService;

    public CarController(CarDao carDao, CarService carService) {
        this.carDao = carDao;
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsPage(Model model,
                           @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carDao.getAllCars();
        List<Car> cars1;
        if (null == count) {
            cars1 = cars;
        } else {
            cars1 = carService.getCarsByCount(cars, count);
        }
        model.addAttribute("cars", cars1);
        return "cars";
    }

}