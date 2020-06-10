package org.devops

//格式化输出
def PrintMes(value,color){
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${value} \033[0m",
              'green' : "[1;32m>>>>>>>>>>${value}>>>>>>>>>>[m",
              'green1' : "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}

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

    colors = ['bk'    : "\033[1;30m${value} \033[0m",
              'r'     : "\033[1;31m${value} \033[0m",
              'g'     : "\033[1;32m${value} \033[0m",
              'y'     : "\033[1;33m${value} \033[0m",
              'b'     : "\033[1;34m${value} \033[0m",
              'p'     : "\033[1;35m${value} \033[0m",
              'dg'    : "\033[1;36m${value} \033[0m",
              'w'     : "\033[1;37m${value} \033[0m"
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