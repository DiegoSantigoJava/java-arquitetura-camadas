package repository;

import domain.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> list() {
        return pessoas;
    }

    public Pessoa buscarPorEmail(String email) {

        for (Pessoa pessoa : pessoas) {

            if (pessoa.getEmail().equals(email)) {
                return pessoa;
            }
        }

        return null;
    }

    public void atualizar(Pessoa pessoaAtualizada) {

        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i).getEmail().equals(pessoaAtualizada.getEmail())) {
                pessoas.set(i, pessoaAtualizada);
                return;
            }
        }
    }

    public void remover(String email) {

        Pessoa pessoa = buscarPorEmail(email);

        if (pessoa != null) {
            pessoas.remove(pessoa);
        }
    }
}