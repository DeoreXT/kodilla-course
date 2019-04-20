package com.kodilla.good.patterns.challenges;

public class MailServices implements InformationService {
    public void inform(User user) {
        System.out.println("Send mail to " + user.getUser());
    }
}