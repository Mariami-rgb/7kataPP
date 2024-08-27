package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {


    public List<Car> getCars(int count);
}
