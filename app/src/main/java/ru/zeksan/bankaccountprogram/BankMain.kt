package ru.zeksan.bankaccountprogram

fun main() {
    val meZeksanBankAccount = BankAccount("MeZeksan", 69.420)
    meZeksanBankAccount.deposit(200.0)
    meZeksanBankAccount.displayTransactionHistory()

    meZeksanBankAccount.withdraw(300.0)
    meZeksanBankAccount.deposit(3000.0)

    meZeksanBankAccount.withdraw(2690.60)
    meZeksanBankAccount.displayTransactionHistory()
    print("MeZeksan's balance is ")
    meZeksanBankAccount.acctBalance()


    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    print("Sarah's balance is ")
    sarahBankAccount.acctBalance()
}