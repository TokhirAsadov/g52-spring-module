package uz.pdp.project;

import java.util.HashSet;
import java.util.Set;

public interface DB {
    Set<Card> cards = new HashSet<>();
    Set<TransactionBetweenCards> transactions = new HashSet<>();
}
