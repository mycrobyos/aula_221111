package br.com.ada.aula_221118.repository;

import java.util.Map;

import br.com.ada.aula_221118.model.Mercadoria;

public abstract class StockRepository {
  
  protected static Map<Integer, Mercadoria> estoque;

  public static Map<Integer, Mercadoria> getEstoque() {
    return estoque;
  }

  public void setEstoque(Map<Integer, Mercadoria> estoque) {
    StockRepository.estoque = estoque;
  }
  
}
