package videobot

import grails.converters.JSON

class TestJobController {

    def index() {
        BoardCheckerJob.triggerNow()
        println "buen meme"

        return ([mal: "meme"] as JSON)
    }
}
