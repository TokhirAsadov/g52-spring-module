package uz.pdp;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage(){
        return "Qandaydir message get qilindi";
    }

}
