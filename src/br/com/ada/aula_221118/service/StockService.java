package br.com.ada.aula_221118.service;

import java.util.HashMap;
import java.util.Map;

import br.com.ada.aula_221118.model.Mercadoria;
import br.com.ada.aula_221118.repository.StockRepository;

public class StockService extends StockRepository {

  static Integer id = 1;
  static Map<Integer, Mercadoria> estoque = new HashMap<>();


  public void add(Mercadoria mercadoria) {

    setEstoque(estoque);
    estoque.put(id, mercadoria);
    id++;

  }

  public void remove(Integer id){
    System.out.println("Item a ser removido: ");
    view(id);
    estoque.remove(id);
    System.out.println("Item removido com sucesso");
  }
  

  public void view(Integer id) {

    System.out.println("id: " + id);
    System.out.println("Nome: " + estoque.get(id).getNome());
    System.out.println("Preco: " + estoque.get(id).getPreco());

  }

  public void viewAll() {

    System.out.println("Estoque atual:");

    for (Map.Entry<Integer, Mercadoria> set : estoque.entrySet()) {

      System.out.println("id: " + set.getKey());
      System.out.println("Nome: " + set.getValue().getNome());
      System.out.println("Preço: " + set.getValue().getPreco());

    }
  }

  public void totalByCategory(String category){

    Integer quantity = 0;

    for (Map.Entry<Integer, Mercadoria> set : estoque.entrySet()) {

      if(category.equals(set.getValue().getClass().getSimpleName())){
        quantity++;        
      }
    }
    
    System.out.println("Quantidade em estoque: " + quantity);

  }

  public void viewByCategory(String category){

    System.out.println("Lista de " + category + ":");

    for (Map.Entry<Integer, Mercadoria> set : estoque.entrySet()) {

      if(category.equals(set.getValue().getClass().getSimpleName())){

        System.out.println("id: " + set.getKey());
        System.out.println("Nome: " + estoque.get(set.getKey()).getNome());
        System.out.println("Preco: " + estoque.get(set.getKey()).getPreco());     
      }
    }

  }

}
