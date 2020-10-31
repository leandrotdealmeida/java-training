package br.com.java.javacore.ZZCJdbc.teste;

import br.com.java.javacore.ZZCJdbc.classes.Comprador;
import br.com.java.javacore.ZZCJdbc.db.CompradorDbOld;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
       // inserir();
       // deletar();
       // atualizar();
//      List<Comprador> listComprador =  selecionarTudo();
//        System.out.println(listComprador);
      //  List<Comprador> listComprador2 =  selecionarPorNome("Jah");
       // System.out.println(listComprador2);
      //  CompradorDb.selectMetaDados();
       // CompradorDb.checkDriverStatus();
       // CompradorDb.testPipeScroll();
       // CompradorDb.updateNomesToLowerCase();
       // System.out.println(CompradorDb.selectAByNamePreparedStatement("le"));
       //
       // System.out.println("Call:" + CompradorDb.selectAByNameCallableStatement("%jah%"));
       // System.out.println(CompradorDb.selectAByNameRowSet("jah"));
        //CompradorDb.updateRowSet(new Comprador(1,"000.111.222.33","Maria"));
        //CompradorDb.updateRowSetCached(new Comprador(1, "000.000.000.00", "Leandro"));
        try {
            CompradorDbOld.saveTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void inserir() {
        Comprador comprador = new Comprador("071.157.076.22", "Joao");
        CompradorDbOld compradorDb = new CompradorDbOld();
        compradorDb.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDbOld.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.000.000.00", "Leandro");
         CompradorDbOld.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDbOld.selectAll();
    }

    public static List<Comprador> selecionarPorNome(String nome) {
        return CompradorDbOld.selectAByName(nome);
    }


}
