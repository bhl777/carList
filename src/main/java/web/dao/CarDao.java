package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Car1", 250,"red"));
        carList.add(new Car("Car2", 170,"green"));
        carList.add(new Car("Car3", 200,"black"));
        carList.add(new Car("Car4", 220,"blue"));
        carList.add(new Car("Car5", 320,"yellow"));
    }

    public List<Car> showCarList() {
        return carList;
    }
}
