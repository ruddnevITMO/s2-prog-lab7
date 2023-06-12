package ru.rudXson.datatype;


import java.io.Serializable;

public enum View implements Serializable {
    STREET,
    PARK,
    NORMAL,
    GOOD,
    TERRIBLE;


    @Override
    public String toString() {
        return "'" + this.name() + "'";
    }
}