package web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public String getCats(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        List<Car> cars;
        if(count.isPresent()){
            cars = carService.getCountCars(count.get());
        } else {
            cars = carService.getAllCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
