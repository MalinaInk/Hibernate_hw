package org.malinaInk.model;


import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int employeeId;
    @Column(name = "first_name")
    private String employeeFirstName;
    @Column(name = "last_name")
    private String employeeLastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int ageOfEmployee;
    @Column(name = "city_id")
    private int cityId;

    public Employee() {
    }

    public Employee(String employeeFirstName, String employeeLastName, String gender, int ageOfEmployee, int cityId) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.gender = gender;
        this.ageOfEmployee = ageOfEmployee;
        this.cityId = cityId;
    }

    public Employee(int employeeId, String employeeFirstName, String employeeLastName, String gender, int ageOfEmployee, int cityId) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.gender = gender;
        this.ageOfEmployee = ageOfEmployee;
        this.cityId = cityId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAgeOfEmployee() {
        return ageOfEmployee;
    }

    public void setAgeOfEmployee(int ageOfEmployee) {
        this.ageOfEmployee = ageOfEmployee;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.malinaInk.model.Employee employee = (org.malinaInk.model.Employee) o;
        return employeeId == employee.employeeId && ageOfEmployee == employee.ageOfEmployee && cityId == employee.cityId && Objects.equals(employeeFirstName, employee.employeeFirstName) && Objects.equals(employeeLastName, employee.employeeLastName) && Objects.equals(gender, employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeFirstName, employeeLastName, gender, ageOfEmployee, cityId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", gender='" + gender + '\'' +
                ", ageOfEmployee=" + ageOfEmployee +
                ", cityId=" + cityId +
                '}';
    }
}

