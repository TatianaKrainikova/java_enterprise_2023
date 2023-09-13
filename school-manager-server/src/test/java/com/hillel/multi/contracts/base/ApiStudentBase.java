package com.hillel.multi.contracts.base;

import com.hillel.multi.service.StudentService;
import org.springframework.boot.test.mock.mockito.MockBean;

public class ApiStudentBase extends ContractTestRunner {

    @MockBean
    private StudentService studentService;
}
