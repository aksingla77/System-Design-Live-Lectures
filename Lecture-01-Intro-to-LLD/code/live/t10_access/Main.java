package t10_access;

// Topic 3: access modifiers.
// Live: create Wallet.java in this folder with a public balance, then fix it.
public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setBalance(-5000);
        // wallet.balance = -5000;
        System.out.println(wallet.getBalance());   // 0.0, no error
    }
}
