package ru.sfedu.hibernatecoursezz.lab4.componentCollectionMap.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Plan implements Serializable {

    private String pname;


    public Plan() {};

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        if(!getName().equals(plan.getName())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Plan{" +
                "pname='" + getName() + '\'' +
                '}';
    }
}
