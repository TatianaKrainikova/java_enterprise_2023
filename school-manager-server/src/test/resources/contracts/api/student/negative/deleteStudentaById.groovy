package contracts.api.student.negative

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""

Representation of the failed execution of the scenario of deleting student by ID

""")
    request {
        method 'DELETE'
        url '/api/students/delete/second'
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('negativeDeleteStudent.json'))
    }
    response {
        status(505)
        body(file('negativeDeleteStudent.json'))
    }
}