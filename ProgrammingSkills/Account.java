package ProgrammingSkills;

import static ProgrammingSkills.Account.SyncDemo.noc;

public class Account {
    private int bal = 0;

    synchronized void deposit(int amt) {
        bal = bal + amt;
        System.out.println("Current balance is: " + bal);
    }

    int getBal() {

        return bal;
    }

    static class cust extends Thread {
        Account ac;

        cust(Account ac) {
            this.ac = ac;
        }

        public void run() {
            ac.deposit(10);
        }
    }

    class SyncDemo {
        public static final int noc = 5;


    }

    public static void main(String[] args) {
        Account ac = new Account();
        cust cu[]= new cust[noc];
        for (int i = 0; i <noc ; i++) {
            cu[i]= new cust(ac);
        }

    }
}

