package com.roadmap.service;

import com.roadmap.model.BankAccount;
import com.roadmap.exception.InsufficientFundsException;
import com.roadmap.exception.InvalidAmountException;

public class BankService {

    public void deposit(BankAccount account, double amount) {
        if(amount <= 0) {
            throw new InvalidAmountException("El monto a depositar debe ser valido.");
        }
        account.deposit(amount);
    }

    public void withdraw(BankAccount account, double amount) {
        if(amount <= 0) {
            throw new InvalidAmountException("El monto a depositar debe ser valido.");
        }
        if(account.getBalance() < amount) {
            throw new InsufficientFundsException("Fondos insuficientes en la cuenta.");
        }
        account.withdraw(amount);
    }

    public void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            withdraw(from, amount);
            deposit(to, amount);
        } catch (RuntimeException e) {
            System.out.println("Error en la transferencia: " + e.getMessage());
            throw e;
        }
    }
}
