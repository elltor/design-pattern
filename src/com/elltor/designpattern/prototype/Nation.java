package com.elltor.designpattern.prototype;

public class Nation {
    private String nat;

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "nat='" + nat + '\'' +
                '}';
    }
}
