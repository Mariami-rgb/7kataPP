package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", 2020, "black"));
        cars.add(new Car("BMW", 2021, "red"));
        cars.add(new Car("Tesla", 2022, "green"));
        cars.add(new Car("Haval", 2023, "yellow"));
        cars.add(new Car("Moskvich", 2024, "blue"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 5) {
            return cars;
        }
        List <Car> carsResult = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            carsResult.add(cars.get(i));
        }
        return carsResult;
    }


}
