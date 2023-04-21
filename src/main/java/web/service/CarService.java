package web.service;

import web.model.Car;

import java.util.List;


public interface CarService {
    List<Car> getCarsByCount(List<Car> cars, int count);
}
