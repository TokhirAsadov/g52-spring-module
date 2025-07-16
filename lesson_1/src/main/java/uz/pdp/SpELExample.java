package uz.pdp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ToString
public class SpELExample {
    // 1. Literal Ifodalar
    @Value("#{42}")
    private int literalInt;

    @Value("#{'salom'}")
    private String literalString;

    // 2. Boolean va Relational Operators
    @Value("#{5 > 3}")
    private boolean isGreater;

    // 3. Oddiy Ifoda (Regex)
    @Value("#{'Anvar' matches 'A.*'}")
    private boolean nameStartsWithA;

    // 4. Class Ifoda
    @Value("#{T(java.util.Date)}")
    private Class<?> dateClass;

    @Value("#{user.fullName}")
    private String userFullName;

    @Value("#{user.getAge}")
    private Integer userAge;

    @Value("#{user.getAge >= 18}")
    private Boolean isAdult;

    @Value("#{user.age >= 18 ? 'adult' : 'baby'}")
    private String userGeneration;

    @Value("#{new uz.pdp.User('Eshmat Toshmatov',50)}")
    private User user;

    @Value("#{messageService.getMessage}")
    private String message;

    @Value("#{new int[]{1,5,3}}")
    private int[] arrs;

    @Value("#{{'olma','anor','tarvuz'}}")
    private List<String> fruits;

    @Value("#{{'bir':1, 'ikki':2}}")
    private Map<String, Integer> numberMap;

    @Value("#{}")
    private String userUpperFullName;

}
