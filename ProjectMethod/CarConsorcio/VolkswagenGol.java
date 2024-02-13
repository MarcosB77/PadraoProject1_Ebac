package ProjectMethod.CarConsorcio;

import ProjectMethod.Int.FabricarCar;


//implenta interfa
public class VolkswagenGol implements FabricarCar {
    @Override
    public void modeloCar() {
        System.out.println(" Volkswagen Gol  ");
    }
}
