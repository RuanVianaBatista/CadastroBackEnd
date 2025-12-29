package Moris.Cadastro.missao;

public enum DificuldadeEnum {
    Z("Very Hard"),
    A("Dificil"),
    B("Normal"),
    C("Facil");

    private String descricao;

    DificuldadeEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "DificuldadeEnum{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
