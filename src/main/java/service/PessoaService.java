package service;

import domain.Pessoa;
import repository.PessoaRepository;
import exception.EmailJaCadastradoException;


public class PessoaService {

    public void cadastrarPessoa(Pessoa pessoa, PessoaRepository repository) {

        Pessoa pessoaEncontrada = repository.buscarPorEmail(pessoa.getEmail());

        if (pessoaEncontrada != null) {
            throw new EmailJaCadastradoException("Email já cadastrado.");
        }

        repository.salvar(pessoa);
    }
}