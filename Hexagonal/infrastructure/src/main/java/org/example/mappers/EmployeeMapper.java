package org.example.mappers;

import org.example.entity.Category;
import org.example.entity.Employee;
import org.exemple.data.CategoryDto;
import org.exemple.data.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDto employeeDtoToEmployee(Employee employee);
    Employee employeeToEmployeeDto(EmployeeDto employeeDto);
    //listado
    List<EmployeeDto> employeeDtoListToEmployeeList(List<Employee> employeeList);
    List<Employee> employeeListToEmployeeDtoList(List<EmployeeDto> employeeDtoList);
}
