package ru.tbank.education.school.lesson1

/**
 * Сумма четных чисел.
 */
fun sumEvenNumbers(numbers: Array<Int>): Int {
    var count = 0
    for (i in 0..numbers.size) {
        if(numbers[i] % 2 == 0)
        {
            count += numbers[i]
        }
    }
    return count
}
