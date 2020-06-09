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
        println(name + " is running ...")

        println("the " + name + " is go ...")
    }

    public static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())

        d.run()
    }
}
