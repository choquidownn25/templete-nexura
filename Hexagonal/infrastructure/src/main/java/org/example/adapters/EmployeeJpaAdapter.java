package org.example.adapters;

import org.example.repository.EmployeeRepository;
import org.exemple.data.EmployeeDto;
import org.exemple.ports.spi.EmployeePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeJpaAdapter implements EmployeePersistencePort {
    //@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto addEmployeeDto(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto updateEmployeeDto(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployeeDto(Integer id) {

    }

    @Override
    public List<EmployeeDto> getEmployees() {
        return null;
    }

    @Override
    public EmployeeDto getEmployeeDtoById(Integer id) {
        return null;
    }
}
