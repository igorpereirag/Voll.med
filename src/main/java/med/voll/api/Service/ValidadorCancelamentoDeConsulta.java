package med.voll.api.Service;

import med.voll.api.dtos.Consultas.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}