"""

输出pipeline环境变量

"""

def env() {

    log.v("print env ...")

    println("CHANGE_ID:" + CHANGE_ID)
    println("CHANGE_ID:" + ${env.CHANGE_ID})

    def env = []

    """分支名"""
    env.add("BRANCH_NAME")

    """分支信息"""
    env.add("CHANGE_ID")
    env.add("CHANGE_URL")
    env.add("CHANGE_TITLE")
    env.add("CHANGE_AUTHOR")
    env.add("CHANGE_AUTHOR_DISPLAY_NAME")
    env.add("CHANGE_AUTHOR_EMAIL")
    env.add("CHANGE_TARGET")
    env.add("CHANGE_BRANCH")
    env.add("CHANGE_FORK")

    """TAG信息"""
    env.add("TAG_NAME")
    env.add("TAG_TIMESTAMP")
    env.add("TAG_UNIXTIME")
    env.add("TAG_DATE")

    """BUILD信息"""
    env.add("BUILD_ID")
    env.add("BUILD_URL")
    env.add("BUILD_NUMBER")
    env.add("BUILD_DISPLAY_NAME")

    """JOB信息"""
    env.add("JOB_URL")
    env.add("JOB_NAME")
    env.add("JOB_BASE_NAME")
    env.add("EXECUTOR_NUMBER")

    """NODE信息"""
    env.add("NODE_NAME")
    env.add("NODE_LABELS")
    env.add("WORKSPACE")
    env.add("JENKINS_HOME")
    env.add("JENKINS_URL")

    env.each {
        e -> println(e)
    }

    env.each {
        e -> sh "echo \${e}"
    }
}

def print_currentBuild() {
    build = []
}
