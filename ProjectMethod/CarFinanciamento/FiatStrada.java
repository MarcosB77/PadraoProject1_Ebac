package ProjectMethod.CarFinanciamento;

import ProjectMethod.Int.FabricarCar;

//implenta interfa
public class FiatStrada implements FabricarCar {
    @Override
    public void modeloCar() {
        System.out.println("Fiat Strada Pick Up");
    }
}
