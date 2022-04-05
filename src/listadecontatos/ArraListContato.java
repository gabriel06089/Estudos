package listadecontatos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraListContato {
    public static void main(String[] args) {
        Dados dados = new Dados();

        for (int i = 1; i <=5; i++){
            Contato contato = new Contato("Nome"+i, "Celular" +i, "Email"+i);
                    dados.adicionar(contato);
        }
        System.out.println("--Primeira Listagem");
        dados.listar();
        System.out.println("--------------------");

        System.out.println("--Atualizar o primeiro contato");
        dados.atualizar(0, new Contato("Cicrano","4002-8922","joaozinho23cm@luansantana2005.com"));

        System.out.println("Segunda listagem");
        dados.listar();
        System.out.println("---------------------");

        System.out.println("-- Remover o primeiro contato");
        dados.remover(0);
        System.out.println("----------------------");

        System.out.println("Terceira listagem");
        dados.listar();
        System.out.println("-----------------------");

        System.out.println("-- Pesquisar nome");
        System.out.println(dados.pesquisarNome("Nome 2"));
        System.out.println(dados.pesquisarNome("Nome 9"));
        System.out.println("------------------------");

        }

    }



