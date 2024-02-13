package ProjectMethod.factory;

import ProjectMethod.Int.Informacao;
import ProjectMethod.TiposDeVenda.Consorcio;

//implenta interfa VendaFactory
public class ConsorcioFactory implements VendaFactory{
    @Override
    public Informacao criaVenda() {
        return new  Consorcio();
    }
}
