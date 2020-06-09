package org.devops

class Dog {

    def name;

    Dog() {

    }

    Dog(name) {
        this.name = name
    }

    def getName() {
        return name
    }

    void setName(name) {
        this.name = name
    }

    def run() {

        println(this.name + " is running ...")
    }

    public static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())

        d.run()
    }
}
