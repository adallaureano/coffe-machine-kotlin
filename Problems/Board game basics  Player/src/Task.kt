data class Player(var id: Int, val name: String, val hp: Int) {

    companion object {
        fun create(name: String) = Player((0..100).random(), name, 100)
    }
}
