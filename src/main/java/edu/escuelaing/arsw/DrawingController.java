package edu.escuelaing.arsw;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class DrawingController {

    @MessageMapping("/draw")
    @SendTo("/topic/draw")
    public DrawingMessage sendDrawing(DrawingMessage message) {
        return message;
    }
}

