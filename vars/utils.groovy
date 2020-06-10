"""

输出pipeline环境变量

"""

def __env() {

    log.v("print __env list ...")
    log.v("CHANGE_ID:  ${env.CHANGE_ID}")
    echo  "CHANGE_ID:  ${env.CHANGE_ID}"

    def envlist = []

    """分支名"""
    envlist.add("BRANCH_NAME")

    """分支信息"""
    envlist.add("CHANGE_ID")
    envlist.add("CHANGE_URL")
    envlist.add("CHANGE_TITLE")
    envlist.add("CHANGE_AUTHOR")
    envlist.add("CHANGE_AUTHOR_DISPLAY_NAME")
    envlist.add("CHANGE_AUTHOR_EMAIL")
    envlist.add("CHANGE_TARGET")
    envlist.add("CHANGE_BRANCH")
    envlist.add("CHANGE_FORK")

    """TAG信息"""
    envlist.add("TAG_NAME")
    envlist.add("TAG_TIMESTAMP")
    envlist.add("TAG_UNIXTIME")
    envlist.add("TAG_DATE")

    """BUILD信息"""
    envlist.add("BUILD_ID")
    envlist.add("BUILD_URL")
    envlist.add("BUILD_NUMBER")
    envlist.add("BUILD_DISPLAY_NAME")

    """JOB信息"""
    envlist.add("JOB_URL")
    envlist.add("JOB_NAME")
    envlist.add("JOB_BASE_NAME")
    envlist.add("EXECUTOR_NUMBER")

    """NODE信息"""
    envlist.add("NODE_NAME")
    envlist.add("NODE_LABELS")
    envlist.add("WORKSPACE")
    envlist.add("JENKINS_HOME")
    envlist.add("JENKINS_URL")

    envlist.each {
        e -> println(e)
    }

//    envlist.each {
//        e -> sh "echo ${envlist.${e}}"
//    }




//
//    envlist.each {
//        e -> sh "echo \${e}"
//    }

    log.v("print __env list end ...")
}

def print_currentBuild() {
    build = []
}
