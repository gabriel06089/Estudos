package listadecontatos;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    ArrayList<Contato> contatos = new ArrayList<>();
     public Dados(){
         this.contatos = new ArrayList<>();
     }
     public void adicionar(Contato contato){
         contatos.add(contato);
     }
     public void atualizar(int indice, Contato contato){
         if (indice < contatos.size()){
             contatos.set(indice,contato);
         }
     }
     public void  listar(){
         for (Contato contato : contatos){
             System.out.println("Nome: " + contato.getNome() + "\n" + "Celular: " + contato.getCelular() + "\n"+ "Email: " + contato.getEmail()+ "\n");
         }
     }
     public List<Contato> pesquisarNome(String nome){
         List<Contato> resultado = new ArrayList<>();
         for (Contato contato : contatos){
             if (contato.getNome().equalsIgnoreCase(nome)){
                 resultado.add(contato);
             }
         }
     return resultado;

    }
    public void  remover (int indice) {
     if (indice < contatos.size()){
     contatos.remove(indice);
     }
    }
}
