package org.shaotang.design.pattern.abstractfactory.sample2;

public class GAMainboard implements MainbordApi {

    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("GAMainboard,cpuHoles:" + cpuHoles);
    }
}
