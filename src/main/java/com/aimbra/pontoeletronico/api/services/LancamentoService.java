package com.aimbra.pontoeletronico.api.services;

import com.aimbra.pontoeletronico.api.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public interface LancamentoService {

    /**
     * Retorna uma lista paginada de um determinado lançamento de um funcionario
     * @param funcionarioId
     * @param pageRequest
     * @return Optional<Lancamento>
     */
    Page<Lancamento> buscaPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * Retorna um lançamento Por Id
     * @param id
     * @return Optional<Lancamento>
     */
    Optional<Lancamento> buscaPorId(Long id);

    /**
     * Persiste um lançamento na base de dados
     * @param lancamento
     * @return Lancamento
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * remove um lançamento do banco de dados;
     * @param id
     */
    void remover(Long id);

}
