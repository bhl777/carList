package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {

    private final CarDao carDao;

    public CarsController(CarDao carDao) {
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
    public String printCars( Model model) {

        model.addAttribute("carList", carDao.showCarList());
        return "cars";
    }
}
