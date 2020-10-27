package br.com.java.javacore.Npolimorfismo.classes;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nso arquivos");
    }
}
