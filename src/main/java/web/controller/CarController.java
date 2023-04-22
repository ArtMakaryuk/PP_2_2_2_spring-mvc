package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

@Controller
public class CarController {
    private final CarDao carDao;
    private final CarService carService;

    public CarController(CarDao carDao, CarService carService) {
        this.carDao = carDao;
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsPage(Model model,
                           @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carService.getCarsByCount(carDao.getAllCars(), count));
        return "cars";
    }

}