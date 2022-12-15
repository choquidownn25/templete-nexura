package org.exemple.ports.spi;

import org.exemple.data.CategoryDto;
import org.exemple.data.EmployeeDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface EmployeePersistencePort {
    EmployeeDto addEmployeeDto(EmployeeDto employeeDto);
    EmployeeDto updateEmployeeDto(EmployeeDto employeeDto);
    void deleteEmployeeDto(Integer id);
    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployeeDtoById(Integer id);
}
