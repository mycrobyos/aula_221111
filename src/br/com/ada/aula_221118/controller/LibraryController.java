package br.com.ada.aula_221118.controller;

import br.com.ada.aula_221118.model.Album;
import br.com.ada.aula_221118.model.Category;
import br.com.ada.aula_221118.model.Filme;
import br.com.ada.aula_221118.model.Jogo;
import br.com.ada.aula_221118.model.Livro;
import br.com.ada.aula_221118.repository.StockRepository;
import br.com.ada.aula_221118.service.CashierService;
import br.com.ada.aula_221118.service.StockService;

public class LibraryController {

  public static void main(String[] args) {

    StockService stock = new StockService();
    CashierService cashier = new CashierService();


    stock.add(new Livro("Como programar", 100.00D, "Programação", "Daniel", "Ada Livros"));
    stock.add(new Filme("Java rules", 200.00D, "SciFi", "Spielberg", "F1rst Productions"));
    stock.add(new Filme("Java rules", 200.00D, "SciFi", "Spielberg", "F1rst Productions"));
    stock.add(new Album("Musica1", 50.0D, "Eletronica", "Let's Code", "Ada Records"));
    stock.add(new Album("Musica1", 50.0D, "Eletronica", "Let's Code", "Ada Records"));
    stock.add(new Album("Musica1", 50.0D, "Eletronica", "Let's Code", "Ada Records"));
    stock.add(new Album("Musica1", 50.0D, "Eletronica", "Let's Code", "Ada Records"));
    stock.add(new Jogo("Pacman", 80.0D, "Arcade", "Namco", "Atari"));
    stock.add(new Jogo("Pacman", 80.0D, "Arcade", "Namco", "Atari"));
    
    stock.viewAll();
    System.out.println("===============================");

    stock.view(1);
    System.out.println("===============================");

    stock.remove(2);
    System.out.println("===============================");

    stock.totalByCategory(Category.ALBUM.getTitle());
    System.out.println("===============================");

    stock.viewByCategory(Category.JOGO.getTitle());
    System.out.println("===============================");

    cashier.sell(4, StockRepository.getEstoque());
    CashierService.getAmount();
    stock.viewAll();

    System.out.println("===============================");


    // System.out.println("===============================");
    // System.out.println("===============================");
    // System.out.println("===============================");
    // System.out.println("===============================");

    
  }
  
}
