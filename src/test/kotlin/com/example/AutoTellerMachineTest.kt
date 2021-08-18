package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AutoTellerMachineTest: StringSpec({
    "should print a receipt if money is withdrawn successfully"{
        val printer=FakePrinter()
        val fakeBankingService =FakeBankingService(true)
        val atm=AutoTellerMachine(printer,fakeBankingService).withdraw(100)
        printer.printCount shouldBe 1
        printer.printText shouldBe "100 withdrawn"

 }
    "should throw exception if banking service throws an exception"{
        val printer = FakePrinter()
        val fakeBankingService =FakeBankingService(false)
        val atm=AutoTellerMachine(printer,fakeBankingService).withdraw(1000)
        printer.printText shouldBe "error withdrawing amount"
    }
})