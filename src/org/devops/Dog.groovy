package org.devops

class Dog {

    def name
    def tools
    def toemail

    Dog() {

    }

    Dog(name) {
        this.name = name
        tools.PrintMes("new Dog ","green")
    }

    def getName() {
        tools.PrintMes("get name $name","green")
        return name
    }

    void setName(name) {
        this.name = name
        tools.PrintMes("set name $name","green")
    }

    def run() {
        setName("小小鸟")

        tools.PrintMes("测试 库之前的调用关系","green")
    }

    def init() {
        tools = new tools()
        toemail = new toemail()

        tools.PrintMes("dog init ...","green")
    }

    static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())
        d.run()
        println(d.getName())
    }
}
