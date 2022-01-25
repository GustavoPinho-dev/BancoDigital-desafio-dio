package one.digitalinnovation.desafio;

import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes() {
        for (Conta conta:contas) {
            System.out.println(conta.cliente.getNome());
        }
    }
}
