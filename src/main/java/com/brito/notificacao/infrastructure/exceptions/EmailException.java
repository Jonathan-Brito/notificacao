package com.brito.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException{

    public EmailException(String mensangem){
        super(mensangem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
