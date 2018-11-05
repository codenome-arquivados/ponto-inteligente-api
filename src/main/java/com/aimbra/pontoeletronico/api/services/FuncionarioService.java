package com.aimbra.pontoeletronico.api.services;

import com.aimbra.pontoeletronico.api.entities.Funcionario;

import java.util.Optional;

public interface FuncionarioService {
    /**
     * Persiste um funcionario em uma base de dados
     * @param funcionario
     * @return Funcionario
     */
    Funcionario persistir(Funcionario funcionario);

    /**
     * Busca e retorna um funcionário dado um cpf
     * @param cpf
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorCpf(String cpf);

    /**
     * Busca e retorna um funcionario dado um email
     * @param email
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscaPorEmail(String email);

    /**
     * Busca e retorna um funcionario dado um Id
     * @param Id
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorId(Long Id);
}
