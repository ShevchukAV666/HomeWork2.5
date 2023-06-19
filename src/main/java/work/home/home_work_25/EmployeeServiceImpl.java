package work.home.home_work_25;

import org.springframework.stereotype.Service;
import work.home.home_work_25.exeption.EmployeeNotFoundExceptions;
import work.home.home_work_25.exeption.exception.EmployAlreadyAddException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List <Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }


    @Override
    public Employee addEmployee(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)) {
           throw new EmployAlreadyAddException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee removeEmployee(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundExceptions();
    }

        @Override
        public Employee findEmployee (String firsName, String lastName){
            Employee employee = new Employee(firsName, lastName);

            if (employeeList.contains(employee)) {
                return employee;
            }
            throw new EmployeeNotFoundExceptions();

        }

    @Override
    public Collection<Employee> findAllEmployee() {
        return new ArrayList<>(employeeList);
    }


}