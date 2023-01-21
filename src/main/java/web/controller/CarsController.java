package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarDao carDao;

    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping( value = "/cars")
    public String printCarText(@RequestParam(value="count", defaultValue="5") int count,ModelMap model) {
        model.addAttribute("cars",carDao.index(count));

        if (count >= 5) {
            return "cars";
        } else { return "cars"; }
    }
}
