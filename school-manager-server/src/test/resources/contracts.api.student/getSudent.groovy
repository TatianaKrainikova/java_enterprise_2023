import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url $(consumer(regex('/api/students/[0-9]{2}')), producer('/api/students/5'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveStudent.json'))
    }

    response {
        status OK()
        body(file('positiveStudent.json'))
    }
}