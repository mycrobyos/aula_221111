package br.com.ada.aula_221118.model;

public class Jogo extends Mercadoria {

  public String genero;
  public String distribuidora;
  public String estudio;
  
  public Jogo(String nome, Double preco, String genero, String distribuidora, String estudio) {
    super(nome, preco);
    this.genero = genero;
    this.distribuidora = distribuidora;
    this.estudio = estudio;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDistribuidora() {
    return distribuidora;
  }

  public void setDistribuidora(String distribuidora) {
    this.distribuidora = distribuidora;
  }

  public String getEstudio() {
    return estudio;
  }

  public void setEstudio(String estudio) {
    this.estudio = estudio;
  }
  
}
