package br.com.ada.aula_221118.model;

public enum Category {

  ALBUM("Album"),
  BRINQUEDO("Brinquedo"),
  FILME("Filme"),
  JOGO("Jogo"),
  LIVRO("Livro");

  public String getTitle() {
    return title;
  }

  private Category(String title) {
    this.title = title;
  }

  private final String title;

 
}
