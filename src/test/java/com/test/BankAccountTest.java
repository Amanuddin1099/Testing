package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    @DisplayName("Withdraw $700 Successfully")
    public void testWithdraw(){

        BankAccount Bank = new BankAccount(9000,-1000);
        Bank.withDraw(700);
        assertEquals(8300, Bank.getBalance());

    }

    @Test
    @DisplayName("Deposit $8000 Successfully")
    public void testDeposit(){
        BankAccount bank = new BankAccount(9000,0);
        bank.deposit(8000);
        assertEquals(17000,bank.getBalance());


}}
