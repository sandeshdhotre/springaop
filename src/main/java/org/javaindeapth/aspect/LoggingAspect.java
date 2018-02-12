package org.javaindeapth.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut("execution org.javaindeapth.entity..*")
	public void constructor() {};
}
