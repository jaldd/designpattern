package org.shaotang.design.pattern.abstractfactory.sample2;

public class MSIMainbord implements MainbordApi {

    private int cpuHoles = 0;

    public MSIMainbord(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("MSIMainbord,cpuHoles:" + cpuHoles);
    }
}
