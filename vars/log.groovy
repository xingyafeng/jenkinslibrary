"""

日志输出

"""

''' 显示 '''

def loglevel = 0

"""
bk : 黑色
r  : 红色
g  : 绿色
y  : 黄色
b  : 蓝色
p  : 紫色
dg : 深绿色
w  : 白色
"""
def echo(type, value) {

    colors = ['bk'    : "\033[30m ${value} \033[0m",
              'r'     : "\033[31m ${value} \033[0m",
              'g'     : "\033[32m ${value} \033[0m",
              'y'     : "\033[33m ${value} \033[0m",
              'b'     : "\033[34m ${value} \033[0m",
              'p'     : "\033[35m ${value} \033[0m",
              'dg'    : "\033[36m ${value} \033[0m",
              'w'     : "\033[37m ${value} \033[0m"
    ]

    ansiColor('xterm') {
        println(colors[type])
    }
}

def v(messages) {

    if (messages) {
        echo ("bk", "[verbose]: ${messages}")
    } else {
        assert messages == "messages"
    }
}

def d(messages) {
    if (messages) {
        echo ("b", "[debug]: ${messages}")
    } else {
        assert messages == "messages"
    }
}

def i(messages) {
    if (messages) {
        echo ("g", "[info]: ${messages}")
    } else {
        assert messages == "messages"
    }
}

def w(messages) {
    if (messages) {
        echo ("y", "[warn]: ${messages}")
    } else {
        assert messages == "messages"
    }
}

def e(messages) {
    if (messages) {
        echo ("r", "[error]: ${messages}")
    } else {
        assert messages == "messages"
    }
}


def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def cmd(messages) {

    sh "echo $messages"
}
