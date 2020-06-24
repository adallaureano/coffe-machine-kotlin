object PlayingField {
    object Size {
        var width = 0
            set(value) {
                field = if (value < 0) 0 else value
            }
        var height = 0
            set(value) {
                field = if (value < 0) 0 else value
            }

        fun changeSize(width: Int, height: Int) {
            this.width = width
            this.height = height
        }
    }
}
