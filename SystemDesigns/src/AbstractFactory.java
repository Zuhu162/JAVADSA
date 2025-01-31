//Interfaces for concrete classes
interface CPU{
    void displayCPUInfo();
}

interface Monitor{
    void displayMonitorInfo();
}

interface Keyboard{
    void displayKeyboardInfo();
}

//Concrete Classes -- Product Classes
class StandardCPU implements CPU{
    @Override
    public void displayCPUInfo() {
        System.out.println("This is a standard CPU");
    }
}

class AdvancedCPU implements CPU{
    @Override
    public void displayCPUInfo(){
        System.out.println("This is an advanced CPU");
    }
}

class StandardKeyboard implements Keyboard{
    @Override
    public void displayKeyboardInfo(){
        System.out.println("This is a standard Keyboard");
    }
}

class AdvancedKeyboard implements Keyboard{
    @Override
    public void displayKeyboardInfo() {
        System.out.println("This is an advanced Keyboard");

    }
}

class StandardMonitor implements Monitor{
    @Override
    public void displayMonitorInfo() {
        System.out.println("This is a standard Monitor");
    }
}

class AdvancedMonitor implements Monitor{
    @Override
    public void displayMonitorInfo() {
        System.out.println("This is an advanced Monitor");
    }
}

//Factory Interface
interface ComputerPartsFactory{
    CPU createCPU();
    Monitor createMonitor();
    Keyboard createKeyboard();
}


//Factories -- Creator Classes
//Standard Computer Factory
class StandardComputerPartsFactory implements ComputerPartsFactory{
    @Override
    public CPU createCPU(){
        return new StandardCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new StandardMonitor();
    }

    @Override
    public Keyboard createKeyboard(){
        return new StandardKeyboard();
    }
}

//Advanced Computer Factory
class AdvancedComputerFactory implements ComputerPartsFactory{
    @Override
    public CPU createCPU(){
        return new AdvancedCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AdvancedMonitor();
    }

    @Override
    public Keyboard createKeyboard(){
        return new AdvancedKeyboard();
    }
}


//Computer -- Client
class Computer{
    private CPU cpu;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(ComputerPartsFactory factory) {
        this.cpu = factory.createCPU();
        this.monitor = factory.createMonitor();
        this.keyboard = factory.createKeyboard();
    }

    public void showSpecs(){
        cpu.displayCPUInfo();
        monitor.displayMonitorInfo();
        keyboard.displayKeyboardInfo();
    }
}



public class AbstractFactory {
    public static void main(String[] args) {
        ComputerPartsFactory StandardPartsFactory = new StandardComputerPartsFactory();
        Computer StandardComputer = new Computer(StandardPartsFactory);
        StandardComputer.showSpecs();

        System.out.println("-------------");

        ComputerPartsFactory AdvancedPartsFactory = new AdvancedComputerFactory();
        Computer AdvancedComputer = new Computer(AdvancedPartsFactory);
        AdvancedComputer.showSpecs();
    }
}
