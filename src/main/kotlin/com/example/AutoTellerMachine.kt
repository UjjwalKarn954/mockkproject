package com.example


class AutoTellerMachine(private val printer: Printer, val bankingService: BankingService ) {
    fun withdraw(amount: Int) {
        //WRITE CODE HERE.
        try {
            printer.print("$amount withdrawn")
        }catch (exception : Exception){
            printer.print("error withdrawing amount")
        }
    }
}

