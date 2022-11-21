package br.com.ada.aula_221118.service;

import java.util.Map;

import br.com.ada.aula_221118.model.Mercadoria;

public class CashierService {

  static Double amount = 1000.00D;

  public void sell(Integer itemId, Map<Integer, Mercadoria> estoque){

    amount += estoque.get(itemId).getPreco();
    estoque.remove(itemId);

  }

  public static void getAmount() {
    System.out.println("Quantia em caixa: " + amount);
  }
 
}
