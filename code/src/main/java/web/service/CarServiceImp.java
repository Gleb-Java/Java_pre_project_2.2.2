package web.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import web.model.Car;

@Component
public class  CarServiceImp implements CarService{

    public List<Car> getCars(int count) {
        List<Car> carsList = Arrays.asList( new Car("Lexus","RX 350","Black"),
                                        new Car("Tesla","Model S","White"),
                                        new Car("BMW","X5","Blue"),
                                        new Car("Audi","Q7","Silver"),
                                        new Car("Mercedes-Benz","GLE 450", "Red"));
        return carsList.subList(0, Math.min(count, carsList.size()));
    }
}
