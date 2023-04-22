package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", 123, "red"));
        cars.add(new Car("Mazda", 222, "black"));
        cars.add(new Car("Volkswagen", 607, "white"));
        cars.add(new Car("Bentley", 999, "gold"));
        cars.add(new Car("Lexus", 111, "blue"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
