package anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liux on 18-1-28.
 */
@Component
public class MessagePrinter {

    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    //    @Autowired
//    public MessagePrinter(MessageService service) {
//        this.service = service;
//    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
