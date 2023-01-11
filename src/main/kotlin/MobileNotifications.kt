fun main () {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(notifications: Int) {
    if (notifications < 99) {
        println("You have $notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}