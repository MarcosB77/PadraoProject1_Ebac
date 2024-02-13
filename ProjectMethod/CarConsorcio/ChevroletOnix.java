package ProjectMethod.CarConsorcio;

import ProjectMethod.Int.FabricarCar;

//implenta interfa
public class ChevroletOnix implements FabricarCar {
    @Override
    public void modeloCar() {
        System.out.println(" Chevrolet Onix");
    }
}
