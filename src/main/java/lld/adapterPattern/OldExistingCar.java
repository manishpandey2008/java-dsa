package lld.adapterPattern;

public class OldExistingCar {
    // This function is incompatible with our current interface (NewPlanInterface)
    private String name;
    OldExistingCar(String name){
        this.name=name;
    }

    public void increaseSpeed() {
        System.out.println("Electric Car is accelerating silently. " + name);
    }

    public void applyBrakes() {
        System.out.println("Electric Car is braking using regenerative braking. " + name);
    }

}
