package org.devops

class Dog {

    def name;

    Dog() {

    }

    Dog(name) {
        this.name = name
        println("name = " + name)
    }

    def getName() {
        return name
    }

    void setName(name) {
        this.name = name
    }

    def run() {
        PrintMes("测试run方法","green")
        setName("小小鸟")
    }

    def PrintMes(value,clr){
        def colors = ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
                  'blue'  : "\033[47;34m ${value} \033[0m",
                  'green' : "[1;32m>>>>>>>>>>${value}>>>>>>>>>>[m",
                  'green1' : "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m" ]
        ansiColor('xterm') {
            println(colors[clr])
        }
    }

    static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())
        d.run()
        println(d.getName())
    }
}
