package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping
    public String getAllCars(Model model) {
        model.addAttribute("cars", carServiceImpl.getAllCars());
        return "cars";
    }
    @GetMapping
    public String getCarsByCount (@RequestParam("count") int count, Model model) {
        model.addAttribute("cars", carServiceImpl.getCars(count));
        return "cars";
    }
}
