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

    def run(def tt) {
        println(name + " is running ...")
        setName(tt)
    }

    public static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())

        d.run("ddd")
    }
}
