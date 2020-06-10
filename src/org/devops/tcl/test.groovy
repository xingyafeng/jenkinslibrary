package org.devops.tcl

class test {

    def log
    def utils

    test(log, utils) {
        this.log = log
        this.utils = utils
    }

    def init() {
        log.v("test init ...")
        utils.print_env()
    }
}
