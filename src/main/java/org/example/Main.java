package org.example;

public class Main {
    public static void main(String[] args) {

      Bank sbi=new Bank("HDFC","HDFC01");
      sbi.Addaccount(4045);
      sbi.DepositeMoney(4045,200);


      SBIbank s1=new SBIbank("SBIN01");
      s1.Addaccount(3465);
      s1.DepositeMoney(3465,5000);
    }
}