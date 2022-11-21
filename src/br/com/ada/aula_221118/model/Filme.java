package br.com.ada.aula_221118.model;

public class Filme extends Mercadoria {

  public String genero;
  public String diretor;
  public String produtor;
  
  public Filme(String nome, Double preco, String genero, String diretor, String produtor) {
    super(nome, preco);
    this.genero = genero;
    this.diretor = diretor;
    this.produtor = produtor;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  public String getProdutor() {
    return produtor;
  }

  public void setProdutor(String produtor) {
    this.produtor = produtor;
  }
  
}
