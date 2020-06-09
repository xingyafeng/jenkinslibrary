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
        setName("小小鸟")

        def tools = new org.devops.tools()
        tools.PrintMes("测试 库之前的调用关系","green")
    }

    static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())
        d.run()
        println(d.getName())
    }
}
