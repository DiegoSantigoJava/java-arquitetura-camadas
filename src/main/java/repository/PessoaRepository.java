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
}