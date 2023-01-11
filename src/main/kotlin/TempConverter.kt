fun main() {
    val celsiusToFahrenheit: (Double) -> Double = { (9 * it / 5) + 32 }
    val kelvinToCelsius: (Double) -> Double = { it - 273.15 }

//    Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
//    Kelvin to Celsius: ° C = K - 273.15
//    Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0,
        "Fahrenheit",
        "Kelvin"
    ) { (5 * (it - 32) / 9) + 273.15 }

//    27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//    350.0 degrees Kelvin is 76.85 degrees Celsius.
//    10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}