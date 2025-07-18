package uz.pdp.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private UUID id;
    private Double balance;
}
