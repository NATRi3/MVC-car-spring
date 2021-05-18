package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1L,"Mercedes-Benz M II (W164) 350",2007));
        carList.add(new Car(2L,"Hyundai ix35 I", 2015));
        carList.add(new Car(3L,"Land Rover Range Rover Evoque I 6-speed", 2012));
        carList.add(new Car(4L,"Peugeot 408 I", 2017));
        carList.add(new Car(5L,"Volkswagen Touareg II", 2013));
    }
    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return carList;
    }
}
