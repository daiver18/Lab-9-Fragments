package com.example.daiverandresdoria.mymail.Models;

import com.example.daiverandresdoria.mymail.Utils.Utils;

public class Mails {

    private String subject;
    private String messaje;
    private String senderName;
    private int color;

    public Mails(String subject, String messaje, String senderName) {
        this.subject = subject;
        this.messaje = messaje;
        this.senderName = senderName;
        this.color = Utils.getRandomColor();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessaje() {
        return messaje;
    }

    public void setMessaje(String messaje) {
        this.messaje = messaje;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
