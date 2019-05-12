package org.shaotang.design.pattern.abstractfactory.sample2;

public class IntelCPU implements CPUApi {
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("intel cpu,pins:" + pins);
    }
}
