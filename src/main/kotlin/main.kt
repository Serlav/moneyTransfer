fun main() {
    var payment = 6000_00
    var tax = payment * 0.0075


    var amount = if (tax > 35_00) {
        payment * 1.0075
    } else {
        payment + 35_00
    }

    println("Сумма перевода в копейках: $amount")
    println("Комиссия в копейках: $tax")
}