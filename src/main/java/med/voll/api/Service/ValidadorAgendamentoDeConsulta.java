package med.voll.api.Service;

import med.voll.api.dtos.Consultas.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);

}