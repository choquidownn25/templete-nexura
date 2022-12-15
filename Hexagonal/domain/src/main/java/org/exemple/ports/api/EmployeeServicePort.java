package org.exemple.ports.api;

import org.exemple.data.EmployeeDto;

import java.util.List;

public interface EmployeeServicePort {
    EmployeeDto addEmployeeDto(EmployeeDto employeeDto);
    EmployeeDto updateEmployeeDto(EmployeeDto employeeDto);
    void deleteEmployeeDto(Integer id);
    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployeeDtoById(Integer id);
}
