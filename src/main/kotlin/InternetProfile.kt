fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerName = if (referrer != null) {
            "Has a referred name ${referrer.name}, who likes to ${referrer.hobby}."
        } else {
            "Doesn't no referrer."
        }

        println("Name: $name\n" +
                "Age: $age\n" +
                "Likes to $hobby. $referrerName\n")
    }
}