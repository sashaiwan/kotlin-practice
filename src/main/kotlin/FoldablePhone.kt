fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.fold()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.unfold()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.switchOff()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false) : Phone(isScreenLightOn = false) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
        isScreenLightOn = false
    }

    fun unfold() {
        isFolded = false
    }
}