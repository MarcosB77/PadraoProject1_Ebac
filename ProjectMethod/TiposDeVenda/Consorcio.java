package ProjectMethod.TiposDeVenda;

import ProjectMethod.Int.Informacao;

/**
 * AlunoMarcos
 */

//implemtan a Interfas

public class Consorcio implements Informacao {
    @Override
    public void exibirInformacao() {
        System.out.println("Modelos Disponiveis para Consorcio com entrada e consulta");
    }

    @Override
    public void anoDoCar() {
        System.out.println("Anos Disponíveis: 2020,2021,2022" +
                "");

    }
}
