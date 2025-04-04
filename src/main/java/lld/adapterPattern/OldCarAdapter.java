package lld.adapterPattern;


public class OldCarAdapter implements NewPlanInterface{

    OldExistingCar oldExistingCar;
    OldCarAdapter(OldExistingCar oldExistingCar){
        this.oldExistingCar=oldExistingCar;
    }


    @Override
    public void deAccelerate() {
        oldExistingCar.applyBrakes();
    }

    @Override
    public void accelerate() {
        oldExistingCar.increaseSpeed();
    }
}
