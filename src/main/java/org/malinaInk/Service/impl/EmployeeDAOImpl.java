package org.malinaInk.Service.impl;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.malinaInk.HibernateSessionFactoryUtil;
import org.malinaInk.Service.EmployeeDAO;
import org.malinaInk.model.Employee;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(Employee employee) {

        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee readById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> readAll() {
        List<Employee> employee = (List<Employee>)  HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("From Employee").list();
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void delete(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}
