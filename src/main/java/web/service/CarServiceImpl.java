package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        List<Car> cars1 = new ArrayList<>();
        if (count == 0) {
            return Collections.emptyList();
        }
        if (count < 0 | count > cars.size()) {
            return cars;
        } else {
            for (int i = 0; i < count; i++)
                cars1.add(cars.get(i));
        }
        return cars1;
    }
}

