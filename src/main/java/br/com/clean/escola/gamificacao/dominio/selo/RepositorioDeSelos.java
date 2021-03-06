package br.com.clean.escola.gamificacao.dominio.selo;


import br.com.clean.escola.shared.dominio.CPF;

import java.util.List;

/** Conceitos do dominio da aplicacao */


public interface RepositorioDeSelos {

    void adicionarSelo(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);

    //...
}
