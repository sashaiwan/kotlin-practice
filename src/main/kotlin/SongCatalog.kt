fun main () {
    val kindOfBlue = SongCatalog("Kind of blue", "Miles Davis", 1953, 100000)
    kindOfBlue.printDescription()
    println(kindOfBlue.isPopular)
}

class SongCatalog(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}