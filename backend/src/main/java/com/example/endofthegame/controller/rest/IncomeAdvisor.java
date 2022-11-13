package com.example.endofthegame.controller.rest;

import com.example.endofthegame.dto.ErrorInfo;
import com.example.endofthegame.exception.IncomeNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.ZonedDateTime;

@RestControllerAdvice
@Slf4j
public class IncomeAdvisor {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(IncomeNotFoundException.class)
    public ErrorInfo handleIncomeNotFoundException(IncomeNotFoundException exc) {
        log.debug("handling not found incomes");
        log.warn("income not found!", exc);
        return ErrorInfo.builder()
                .status(404)
                .error("income not found")
                .message(exc.getMessage())
                .path(ServletUriComponentsBuilder.fromCurrentRequest().toUriString()) // TODO: extract path only
                .timestamp(ZonedDateTime.now())


                .build();
    }
}
