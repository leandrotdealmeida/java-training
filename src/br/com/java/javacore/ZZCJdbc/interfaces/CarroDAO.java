package br.com.java.javacore.ZZCJdbc.interfaces;

import br.com.java.javacore.ZZCJdbc.classes.Carro;

import java.util.List;

public interface CarroDAO {
     void save(Carro carro);

    void delete(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> selectAByName(String nome);
}
