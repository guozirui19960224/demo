package com.guozr.demo.designpatterm.consistency.composite;

/**
 * @ClassName FileTreatementException
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 18:02
 **/
public class FileTreatementException extends RuntimeException {

    public FileTreatementException() {
    }

    public FileTreatementException(String message) {
        super(message);
    }
}
