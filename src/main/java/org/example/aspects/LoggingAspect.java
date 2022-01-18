package org.example.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.Book;
import org.example.Library;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.*;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* getArrayBooks())")
    public void beforeMethodGetBookAdvice() {
        System.out.println("Попытка получть список книг");
    }

    @Before("execution(*  setArrayBooks(..))")
    public void beforeMethodSetBookAdvice() {
        System.out.println("Попытка записать список книг");
    }

    @AfterReturning(pointcut = "execution(* getArrayBooks())",
            returning = "returning")
    public void afterReturningMethodGetBookAdvice(List returning) {
        Book item1 = (Book) returning.get(0);
        item1.setYearOfpublishing(2001);
    }


    @AfterThrowing(pointcut = "execution(* getArrayBooks())"
            ,throwing = "exception")
    public void afterThrowingMethodGetBookAdvice(Throwable exception){
        System.out.println("Exception massage: "+ exception.getMessage());
    }

    @Around("execution(* getArrayBooks())")
    public void aroundMethodGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    }
}
