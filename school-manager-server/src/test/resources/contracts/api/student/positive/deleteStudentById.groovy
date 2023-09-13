package contracts.api.student.positive

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""

Representation of the successful execution of the scenario of deleting student by ID

""")
    request {
        method 'DELETE'
        url $(consumer(regex('/api/students/delete/[0-9]')), producer('/api/students/delete/4'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveDeleteStudent.json'))
    }
    response {
        status OK()
        body(file('positiveDeleteStudent.json'))
    }
}