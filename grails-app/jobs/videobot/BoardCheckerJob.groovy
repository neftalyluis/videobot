package videobot

class BoardCheckerJob {
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        log.info "executed"
        println "buenisimo meme"
    }
}
