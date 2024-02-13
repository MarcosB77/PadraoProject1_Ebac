package ProjectMethod.DemoMain;

import ProjectMethod.CarConsorcio.ChevroletOnix;
import ProjectMethod.CarConsorcio.VolkswagenGol;
import ProjectMethod.CarFinanciamento.FiatStrada;
import ProjectMethod.Int.FabricarCar;
import ProjectMethod.CarFinanciamento.ToyotaHilux;
import ProjectMethod.Int.Informacao;
import  ProjectMethod.factory.VendaFactory;
import  ProjectMethod.factory.ConsorcioFactory;
import  ProjectMethod.factory.FinanciamentoFactory;


public class DemoMain {

    public static void main(String[] args){
        // Cria uma fábrica de consórcio e obtém informações sobre consórcio
        VendaFactory consorcioFactory = new ConsorcioFactory();
        Informacao consorcio = consorcioFactory.criaVenda();
        consorcio.exibirInformacao();
        consorcio.anoDoCar();

        // Cria instâncias de carros para exibição
        FabricarCar carro1 = new ChevroletOnix();
        FabricarCar carro2 = new VolkswagenGol();
        carro1.modeloCar();
        carro2.modeloCar();

        // Financiamento
        VendaFactory financiamentoFactory = new FinanciamentoFactory();
        Informacao financiamento = financiamentoFactory.criaVenda();
        financiamento.exibirInformacao();
        financiamento.anoDoCar();

        // Exibi Carros
        FabricarCar carro3 = new FiatStrada();
        FabricarCar carro4 = new ToyotaHilux();
        carro3.modeloCar();
        carro4.modeloCar();


    }
}
