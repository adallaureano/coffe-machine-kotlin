class Application(var name: String) {

    fun run(names: Array<String>) {
        println(name)
        names.forEach { println(it) }
    }
}