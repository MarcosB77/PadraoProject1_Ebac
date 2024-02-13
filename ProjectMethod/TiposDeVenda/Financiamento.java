package ProjectMethod.TiposDeVenda;

import ProjectMethod.Int.Informacao;

public class Financiamento implements Informacao {

    /**
     * AlunoMarcos
     */

    //implemta a interfa
    @Override
    public void exibirInformacao() {
        System.out.println("Modelos Disponiveis para Financiamento com entrada e consulta");
    }

    @Override
    public void anoDoCar() {
        System.out.println(" Anos Disponíveis: 2019,2020,2021");

    }
}
