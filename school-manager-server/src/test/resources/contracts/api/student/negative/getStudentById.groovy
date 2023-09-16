package contracts.api.student.negative

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""

Representation of the failed execution of the scenario of getting student by ID

""")
    request {
        method 'GET'
        url $(consumer(regex('/api/students/get/[a-zA-Z]{7}')), producer('/api/students/get/someone'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('negativeGetStudent.json'))
    }
    response {
        status(404)
        body(file('negativeGetStudent.json'))
    }
}