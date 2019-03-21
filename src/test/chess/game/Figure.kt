package test.chess.game

abstract class Figure (pos: Position, locationX: Int, locationY: Int) {

    var position = pos
    var locationX = locationX
    var locationY = locationY

    abstract fun move(dir: Direction)
    fun identity() {
        println("I am a $position")
    }
}

class King(locationX: Int, locationY: Int): Figure(Position.KING, locationX, locationY) {



    override fun move(dir: Direction) {
        when(dir) {
            Direction.UP -> locationY++
            Direction.DOWN -> locationY--
            Direction.RIGHT -> locationX++
            Direction.LEFT -> locationX--
        }
    }

}