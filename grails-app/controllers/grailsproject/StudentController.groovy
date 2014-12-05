package grailsproject

class StudentController {
    def scaffold = true

    def search = {
        flash.message = "Search results for: ${params.q}"
        def resultsMap = Student.search(params.q, params)
        render(view: 'list',
                model: [
                        studentInstanceList: resultsMap.results,
                        studentInstanceTotal: Student.countHits(params.q)
                ]
        )
    }
}
