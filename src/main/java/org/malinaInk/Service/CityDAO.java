package org.malinaInk.Service;

import org.malinaInk.model.City;
import org.malinaInk.model.Employee;

import java.util.List;

public interface CityDAO {
    void create(City city);
    City readById(int id);
    List<City> readAll();
    void updateCity(City city);
    void delete(City city);
}
