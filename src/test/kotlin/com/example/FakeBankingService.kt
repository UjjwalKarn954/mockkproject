package com.example

class FakeBankingService(val input :Boolean) :BankingService {

    override fun withdraw(amount: Int) {
        if(!input)throw error("error withdrawing amount")
    }
}