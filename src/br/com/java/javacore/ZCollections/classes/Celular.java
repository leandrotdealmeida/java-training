package br.com.java.javacore.ZCollections.classes;



public class Celular {

    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //simétrico  = para x e y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true tbm
    //transitividade = para x, y e z diferentes de nul se x.equals.(y) == true , logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) tem que ser true
    //consistente = x.equals(y) deve sempre ser retornado mesmo valor
    // para x diferente de null x.equals(null) tem que retornar false

    //Para hashCode
    //se x.equals(y) == true y.hashCode() == x.hashCode();
    //y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true
    //x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
