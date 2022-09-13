package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Model1", "Color1"));
        carList.add(new Car("Model2", "Color2"));
        carList.add(new Car("Model3", "Color3"));
        carList.add(new Car("Model4", "Color4"));
        carList.add(new Car("Model5", "Color5"));
        if (count >= 5) {
            return carList;
        } else {
           return carList.subList(0, count);
        }
    }
}
