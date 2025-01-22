package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarDao carDao;
    private final CarServiceImpl carService;

    public CarsController(CarServiceImpl carService, CarDao carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }


//    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(value = "count", required = false) int count,
//                               Model model) {
//
//        model.addAttribute("carList", count + " " + carDao.showCarList().get(count).getModel());
//        return "cars";
//    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue="0") int count,
                            Model model) {

        model.addAttribute("carList", carService.getListCar(count, carDao.showCarList()));
        return "cars";
    }
}
