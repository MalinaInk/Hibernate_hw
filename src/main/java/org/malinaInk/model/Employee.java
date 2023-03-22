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

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name="city_id", nullable=false)
    private City city;

    public Employee() {
    }

    public Employee(String employeeFirstName, String employeeLastName, String gender, int ageOfEmployee, City city) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.gender = gender;
        this.ageOfEmployee = ageOfEmployee;
        this.city = city;
    }

    public Employee(int employeeId, String employeeFirstName, String employeeLastName, String gender, int ageOfEmployee, City city) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.gender = gender;
        this.ageOfEmployee = ageOfEmployee;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && ageOfEmployee == employee.ageOfEmployee && Objects.equals(employeeFirstName, employee.employeeFirstName) && Objects.equals(employeeLastName, employee.employeeLastName) && Objects.equals(gender, employee.gender) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeFirstName, employeeLastName, gender, ageOfEmployee, city);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", gender='" + gender + '\'' +
                ", ageOfEmployee=" + ageOfEmployee +
                ", city=" + city +
                '}';
    }
}

