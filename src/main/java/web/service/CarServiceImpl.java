package web.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCountCars(int count) {
        return carDao.getCountCars(count);
    }
}
