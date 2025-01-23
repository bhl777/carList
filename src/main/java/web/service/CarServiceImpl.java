package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDao();

    @Override
    public List<Car> getListCar(int count) {

        if (count > 0 && count <5) {
            return carDao.showCarList().subList(0, count);
        }
        else
            return carDao.showCarList();
    }
}
