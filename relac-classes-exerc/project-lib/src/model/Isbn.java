package model;

public class Isbn {

    private final String code;

    public Isbn(String cod) {
        this.code = cod;
    }

    @Override
    public String toString() {
        return code;
    }

}

