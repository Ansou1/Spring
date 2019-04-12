package com.ansou.AOP.aspect;

import com.ansou.AOP.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@After("execution (* com.ansou.AOP.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toString();

		System.out.println("Method call afterFinallyFindAccountsAdvice => " + method);

	}

	@AfterThrowing(pointcut = "execution (* com.ansou.AOP.dao.AccountDAO.findAccounts(..))", throwing = "theExc")
	public void afterThrowingFoundAccountsAdvice(JoinPoint joinPoint, Throwable theExc) {
		String method = joinPoint.getSignature().toString();

		System.out.println("Method call afterThrowingFoundAccountsAdvice => " + method);

		System.out.println("Error throw => " + theExc);
	}

	@AfterReturning(pointcut = "execution (* com.ansou.AOP.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFoundAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		String method = joinPoint.getSignature().toString();
		System.out.println(method);
		System.out.println(result);

		convertAccountsNameToUppercase(result);

		System.out.println("Uppercase");
		System.out.println(result);

	}

	private void convertAccountsNameToUppercase(List<Account> result) {
		for (Account tempAccount : result) {
			tempAccount.setName(tempAccount.getName().toUpperCase());
		}
	}

	@Before("com.ansou.AOP.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n=====>>> Executing @Before advice on method");

		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();

		System.out.println("Signature of calling method => " + methodSignature);

		Object[] args = joinPoint.getArgs();

		for (Object tempsArgs: args) {
			System.out.println(tempsArgs);
			if (tempsArgs instanceof Account) {
				System.out.println(((Account) tempsArgs).getName());
				System.out.println(((Account) tempsArgs).getLevel());
			}
		}
	}
	
}










