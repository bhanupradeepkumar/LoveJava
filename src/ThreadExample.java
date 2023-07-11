public class ThreadExample {
    public static void main(String[] args) {
        Gpay t1 = new Gpay("G pay");
        Debitcard c1 = new Debitcard("master card");
t1.start();
c1.start();


    }
}

class Gpay extends Thread{
    String upiapp;
Gpay(String upiapp){
    System.out.println("transaction initiated...");
    this.upiapp = upiapp;
}
public void run(){
    for(int i=0;i<10;i++) {
        System.out.println("paid succesfully with order id :" +i+Math.random()%10);
    }
}
}

class Debitcard extends Thread{
    String cardType;
    Debitcard(String cardType){
        System.out.println("enter the pin..");
        this.cardType=cardType;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("payment processed collect slip with id :" +i+Math.random()%10);
        }
    }

}
