package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria;

    public Curso() {

    }


    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    @Override
    public double calcularxp() {
        return XP_PADRAO + 20;
    }
}
