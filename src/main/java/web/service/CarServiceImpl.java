package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCar(int count, List<Car> cars) {

        if (count > 0 && count <5 && cars != null) {
            return cars.subList(0, count);
        }
        else
            return cars;



        //return List.of();
    }
}
