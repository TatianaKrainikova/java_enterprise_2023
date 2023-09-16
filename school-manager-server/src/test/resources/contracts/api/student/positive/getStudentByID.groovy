package contracts.api.student.positive

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""

Representation of the successful execution of the scenario of getting student by ID

""")
    request {
        method 'GET'
        url $(consumer(regex('/api/students/get/[0-9]')), producer('/api/students/get/5'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveGetStudent.json'))
    }
    response {
        status OK()
        body(file('positiveGetStudent.json'))
    }
}