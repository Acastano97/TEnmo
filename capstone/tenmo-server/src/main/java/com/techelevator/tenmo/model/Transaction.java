package com.techelevator.tenmo.model;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class Transaction {

    private long transactionId;
    private long fromAccount;
    private long toAccount;
    @Positive
    private BigDecimal amount;

    public Transaction(long transactionId, long fromAccount, long toAccount,BigDecimal amount) {
        this.transactionId = transactionId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public Transaction() {

    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(long fromAccount) {
        this.fromAccount = fromAccount;
    }

    public long getToAccount() {
        return toAccount;
    }

    public void setToAccount(long toAccount) {
        this.toAccount = toAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
