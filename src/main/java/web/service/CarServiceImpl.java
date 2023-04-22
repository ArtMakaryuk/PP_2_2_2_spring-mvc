package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsByCount(List<Car> cars, Integer count) {
        if (null != count) {
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
        } else return cars;
    }
}

