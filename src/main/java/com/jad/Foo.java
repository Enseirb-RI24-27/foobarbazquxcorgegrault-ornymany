package com.jad;


import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public Corge setCorge(Corge corge1) {
        return this.corge = corge1;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz) {

    }

    public void addGrault() {

    }
}
