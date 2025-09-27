package ru.tbank.education.school.lesson3.seminar

import ru.tbank.education.school.lesson3.seminar.bank.Bank
import ru.tbank.education.school.lesson3.seminar.bank.models.Currency

/*
 * 1. Зарегистрировать клиента и открыть ему кредитный и дебетовый счёт.
 * 2. Пополнить кредитный счёт (например, 3000).
 * 3. Снять часть денег с кредитного счёта (например, 1000).
 * 4. Перевести деньги с кредитного счёта на дебетовый счёт (например, 500).
 * 5. Вывести отчёты по обоим счетам и убедиться, что перевод отображается в истории.
 */
fun main(){
    val bank = Bank("Kotlin банк")
    val customer = bank.registerCustomer( "Иван Иванов")
    val debit = bank.openDebitAccount(customer, Currency.RUB)
    val credit = bank.openCreditAccount(customer, Currency.RUB, 1000)
    bank.deposit(credit, 300, "паприколу")
    bank.withdraw(credit, 1000, "паприколу")
    bank.transfer(credit, debit, 500, "паприколу")
    debit.printReport()
    credit.printReport()
}