package br.com.java.javacore.ZZBClassesInternas.test;

public class ClassesInternasTest {
    private String nome = "William Jedi do Dev Dojo";

    class interna{
        public void verClasseExterna() {
            System.out.println(nome);
        }
    }
    public static void main(String[] args) {


    }
}

//class Extena {
//    private String nome = "William Jedi do Dev Dojo";
//
//    class interna{
//        public void verClasseExterna() {
//            System.out.println(nome);
//        }
//    }
//}
