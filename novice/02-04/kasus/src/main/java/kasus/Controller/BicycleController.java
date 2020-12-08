package kasus.Controller;

import kasus.Model.Bicycle;
import kasus.View.BicycleView;

public class BicycleController {

    private Bicycle model;
    private BicycleView view;

    public BicycleController(Bicycle model, BicycleView view){
        this.model = model;
        this.view = view;
     }
  

    /* private Bicycle toUpdateBicycle;
          private BicycleView toUpdateView;
          public BicycleController(Bicycle theBicycle, BicycleView view) {
                toUpdateBicycle = theBicycle;
                toUpdateView = view;
          }
 */
    public Integer getBicycleId() {
        return model.getID();
    }

    public void setBicycleCadence(Integer cadence) {
        model.setCadence(cadence);
    }
    
    public Integer getBicycleCadence() {
        return model.getCadence();
    }

    public void setBicycleGear(Integer gear) {
        model.setGear(gear);
    }

    public Integer getBicycleGear() {
        return model.getGear();
    }

    public Integer getBicycleSpeed() {
        return model.getSpeed();
    }

    public void updateView() {
        view.printBicycleTable(model.getNumberOfBicycles(), model.getCadence(), model.getGear());
    }

    /* public void updateBicycle() {
        
    } */
}
