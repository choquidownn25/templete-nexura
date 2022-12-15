package org.exemple.data.response;

import lombok.*;
import org.exemple.data.CategoryDto;
import org.exemple.data.EmployeeDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmployeeDtoResponse {
    private List<EmployeeDto> employeeDto;
    private Message message;
}
