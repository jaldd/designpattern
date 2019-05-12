package org.shaotang.design.pattern.abstractfactory.sample2;

public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainbordApi mainbord = null;

    public void makeComputer(AbstractFactory schema) {
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainbord = schema.createMainbordApi();

        this.cpu.calculate();
        this.mainbord.installCPU();
    }

}
