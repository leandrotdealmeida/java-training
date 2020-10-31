package br.com.java.javacore.ZZBClassesInternas.test;

public class ClassesLocaisTest {
    private String nome = "Leandro";
    public void faAlgumaCoisa(){
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.faAlgumaCoisa();

    }
}
