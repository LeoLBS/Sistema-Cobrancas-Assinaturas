package br.com.leperber.sistema_cobrancas_assinaturas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class CapturaTratamentoException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<MensagemErroPadrao> capturaErro(IllegalArgumentException except){
        MensagemErroPadrao mensagemErroPadrao = new MensagemErroPadrao(
                LocalDate.now(),
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                except.getMessage()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagemErroPadrao);
    }
}
