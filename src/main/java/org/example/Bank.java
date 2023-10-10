package org.example;

import java.util.HashMap;

public class Bank {
    String BankName;
    String ifsc;
    HashMap<Integer,Integer> accountStorage;

    public Bank(String BankName,String ifsc){
        this.BankName=BankName;
        this.ifsc=ifsc;
        accountStorage=new HashMap<>();

    }

    public void Addaccount(int accId){
        accountStorage.put(accId,0);
        System.out.println("Account Id: "+accId+ " Got Created by : "+BankName);
    }

    public void DepositeMoney(int accId, int money){
        accountStorage.put(accId,accountStorage.get(accId)+money);
        System.out.println("Balance of the Account Id " +accId+" This: "+accountStorage.get(accId));
    }
}
