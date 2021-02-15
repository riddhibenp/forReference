package com.cybage;

public class ThreadHandling implements Runnable{
	Account acc = new Account();

    public static void main(String[] args) {
    	ThreadHandling ts = new ThreadHandling();
        Thread t1 = new Thread(ts, "person 1");
        Thread t2 = new Thread(ts, "person 2");
       
        t1.start();
        t2.start();
       
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            makeWithdraw(3000);
            if (acc.getBal() < 0) {
                System.out.println("account Balance is Over-Limit!");
            }
            
        }
    }


    private synchronized void makeWithdraw(int bal){
        if (acc.getBal()>=bal) {
            System.out.println(Thread.currentThread().getName()+" "+ "is try to withdraw");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.withdraw(bal);
            System.out.println(Thread.currentThread().getName()+" "+ "is complete the withdraw");
        }else{        
            System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough money for withdraw ");
        }
    }

    
}