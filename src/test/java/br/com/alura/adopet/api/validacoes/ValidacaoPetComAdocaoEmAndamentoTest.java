package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.adocao.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidacaoPetComAdocaoEmAndamentoTest {

    @InjectMocks
    private ValidacaoPetDisponivel validacao;

    @Mock
    private PetRepository petRepository;

    @Test
    void deveriaPermitirSolicitacaoDeAdocaoPet() {
        // ARRANGE
        SolicitacaoAdocaoDto dto = new SolicitacaoAdocaoDto(
                7l,
                2l,
                "Motivo qualquer"
        );

        //ASSERT + ACT
        Assertions.assertDoesNotThrow(() -> validacao.validar(dto));
    }
}