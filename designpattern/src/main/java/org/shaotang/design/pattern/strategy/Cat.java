package org.shaotang.design.pattern.strategy;

import java.util.Comparator;

public class Cat implements Comparator<Cat> {

    private int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

//    @Override
//    public int compareTo(Cat o) {
//        return Integer.compare(weight, o.weight);
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
