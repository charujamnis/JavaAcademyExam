package com.dtcc.exams.atm;

public class Account {
    private double balance;
    public Account(double v) {
        this.balance=v;
    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {
        if(this.balance<=0){return true;}
        else{return false;}
    }

    public void deposit(double v) {
        this.balance=this.balance+v;
    }

    public Double withdraw(double v) {
        if(this.balance>=v) this.balance=this.balance-v;
        return this.balance;
    }

    public void transfer(Account b, double v) {
        if(this.balance>=v) {
            this.balance = this.balance() - v;
            b.balance = b.balance() + v;
        }
    }

}
