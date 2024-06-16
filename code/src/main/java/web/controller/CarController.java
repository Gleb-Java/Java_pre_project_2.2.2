package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model) {

        List<Car> cars = carService.getCars(count);
        model.addAttribute("carList", cars);
        return "cars";
    }
}
