package br.com.java.javacore.PAssertions;

public class AssertTest {
    public static void main(String[] args) {
            diasDaSemana(9);
    }

    private static void calculaSalario(double salario){
        assert (salario > 0) : "O salário deve ser maior que 0 " + salario;
        //calcula salario
    }

    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }
    }

    public static  void diasDaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
