package com.finconsgroup.accademy.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspectController {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectController.class);

    @Pointcut("execution(public * com.finconsgroup.accademy.domain.*.*(..))")
    public void logAllPublicMethodsDomain() {
    }

    @Before("logAllPublicMethodsDomain()")
    public void beforeAdvice(JoinPoint joinPoint) {
        logger.info("Entering method: {}", joinPoint.getSignature());
        logger.info("Arguments: {}", Arrays.toString(joinPoint.getArgs()));
    }

    @After("logAllPublicMethodsDomain()")
    public void afterAdvice(JoinPoint joinPoint) {
        logger.info("Exiting method: {}", joinPoint.getSignature());
    }
}
