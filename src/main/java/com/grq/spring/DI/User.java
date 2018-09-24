package com.grq.spring.DI;

public class User {
    private String name;
    private Hobby hobby;
    private User partner;

    public User() {
    }

    public User(String name, Hobby hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public User getPartner() {
        return partner;
    }

    public void setPartner(User partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hobby=" + hobby +
                ", partner=\'" + partner.getName() + "\'}";
    }
}
