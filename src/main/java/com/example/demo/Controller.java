package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class Controller {

    @PostMapping("/validate")
    public Response validateDate(@RequestBody Request request) {
        boolean isCodePCorrect = false;
        boolean isAgeCorrect = false;
        boolean isSerialCorrect = false;

        int codeP = request.getCodeP();
        if (codeP >= 100000){
            int thirdDigit = (codeP/100)%10;
            isCodePCorrect = thirdDigit >= 0 || thirdDigit <= 3;
        }

        if (request.getDateB() != null && request.getDateI() != null){
            isAgeCorrect = java.time.Period.between(request.getDateB(), request.getDateI()).getYears() >= 14;
        }

        int serial = request.getSerial();
        if (serial >= 1000){
            int serialLastTwo = serial % 100;
            isSerialCorrect = serialLastTwo >= 91 || serialLastTwo <= 25;
        }

        boolean isValid = isCodePCorrect && isAgeCorrect && isSerialCorrect;
        return new Response(isValid);
    }
    
}
