package com.guozr.demo.designpatterm.accessstructure.visitor.exception;

/**
 * @ClassName FileTreatementException
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:59
 **/
public class FileTreatementException extends RuntimeException{
    public FileTreatementException() {
    }

    public FileTreatementException(String message) {
        super(message);
    }
}
