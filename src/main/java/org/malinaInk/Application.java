package org.malinaInk;

import org.malinaInk.Service.EmployeeDAO;
import org.malinaInk.Service.impl.EmployeeDAOImpl;
import org.malinaInk.model.City;
import org.malinaInk.model.Employee;
import java.sql.SQLException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        City city7 = new City();

        Employee employee1 = new Employee("Lidia", "Zvereva", "female", 37, city7);
        employeeDAO.create(employee1);

        System.out.println(employeeDAO.readById(5));

        List<Employee> list = employeeDAO.readAll();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Employee employee2 = new Employee("Ivan", "Milkovsky", "male", 29, city7);

        employeeDAO.updateEmployee(employee2);
        employeeDAO.delete(employee2);
    }
}

