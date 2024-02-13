package ProjectMethod.factory;

import ProjectMethod.Int.Informacao;
import ProjectMethod.TiposDeVenda.Financiamento;
//implenta interfa VendaFactory
public class FinanciamentoFactory implements VendaFactory{
    @Override
    public Informacao criaVenda() {
        return new Financiamento();
    }
}
