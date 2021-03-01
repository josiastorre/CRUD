package br.com.jdbc.crud.interfaces;

import br.com.jdbc.crud.classes.Carro;

import java.util.List;

public interface CarroDAO {

    List<Carro> searchByNameCarro(String nome);

    List<Carro> selectAllCarro();

    void saveCarro(Carro carro);

    void deleteCarro(Carro carro);


    void updateCarro(Carro carro);
}
