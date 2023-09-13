package com.hillel.multi.contracts.base;

import com.hillel.multi.service.StudentService;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

public class StudentNegativeBase extends ContractTestRunner {

    @MockBean
    StudentService studentService;
}
