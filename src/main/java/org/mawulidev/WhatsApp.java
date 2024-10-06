package org.mawulidev;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WhatsApp implements MessageService {
    @Override
    public void message() {
        System.out.println("Message from Whatsapp MessageService");
    }
}
