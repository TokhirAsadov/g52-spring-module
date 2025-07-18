package uz.pdp.project;

import org.springframework.stereotype.Component;

@Component
public class TransactionService {

    public void doTransaction(Card sender, Card receiver, Double amount){
        if (sender.getBalance()>=amount) {
            sender.setBalance(sender.getBalance()-amount);
            receiver.setBalance(receiver.getBalance()+amount);
        } else {
            throw new RuntimeException("sender da yetarli mablag` yuq.");
        }
    }

}
