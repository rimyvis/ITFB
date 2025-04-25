package com.example.inn;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
    @PostMapping("/check-inn")
    public Response checkInn(@RequestBody Request request) {
        String inn = request.getInn();

        if (!validateInn(inn)) {
            return new Response("Неверный ИНН");
        }

        int firstDigit = Character.getNumericValue(inn.charAt(0));
        String organization;

        if (firstDigit < 5) {
            organization = "ООО Рога и Копыта";
        } else if (firstDigit >= 5 || firstDigit < 8) {
            organization = "ООО ЗаглушкаСервис";
        } else if (firstDigit >= 8) {
            organization = "ООО Волга";
        } else {
            organization = "Неизвестная организация";
        }

        return new Response(organization);
    }

    private boolean validateInn(String inn) {
        if (inn == null) return false;

        if (inn.length() == 10) {
            return validateInn10(inn);
        } else if (inn.length() == 12) {
            return validateInn12(inn);
        }

        return false;
    }

    private boolean validateInn10(String inn) {

        int[] coeff = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(inn.charAt(i));
            sum += digit * coeff[i];
        }

        int result = (sum % 11) % 10;
        int checkDigit = Character.getNumericValue(inn.charAt(9));
        return result == checkDigit;
    }

    private boolean validateInn12(String inn) {

        int[] coeff11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coeff12 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int sum11 = 0;
        for (int i = 0; i < 10; i++) {
            sum11 += Character.getNumericValue(inn.charAt(i)) * coeff11[i];
        }
        int controlDigit11 = (sum11 % 11) % 10;

        int sum12 = 0;
        for (int i = 0; i < 11; i++) {
            sum12 += Character.getNumericValue(inn.charAt(i)) * coeff12[i];
        }
        int controlDigit12 = (sum12 % 11) % 10;

        int actualDigit11 = Character.getNumericValue(inn.charAt(10));
        int actualDigit12 = Character.getNumericValue(inn.charAt(11));

        return controlDigit11 == actualDigit11 && controlDigit12 == actualDigit12;
    }
}