package com.example.demo;

import java.time.LocalDate;

public class Request {
    private String fullName;
    
    private LocalDate dateB;
    private LocalDate dateI;
    
    private int serial;
    private int number;
    private int codeP;

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public LocalDate getDateB() {return dateB;}
    public void setDateB(LocalDate dateB) {this.dateB = dateB;}

    public int getSerial() {return serial;}
    public void setSerial(int serial) {this.serial = serial;}

    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}

    public int getCodeP() {return codeP;}
    public void setCodeP(int codeP) {this.codeP = codeP;}

    public LocalDate getDateI() {return dateI;}
    public void setDateI(LocalDate dateI) {this.dateI = dateI;}
}