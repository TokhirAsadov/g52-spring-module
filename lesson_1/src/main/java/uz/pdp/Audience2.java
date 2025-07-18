package uz.pdp;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience2 {


    @Before("execution(public * *(..))")
    public void workerBeforePublicMethod(){
        System.out.println("================ public ================");
    }

    @Before("execution(protected * *(..))")
    public void workerBeforeProtectedMethod(){
        System.out.println("================ protected ================");
    }


    @Before("execution(* set*(..))")
    public void workerBeforeSetterMethod(){
        System.out.println("================ setter ================");
    }

    @Before("within(uz.pdp.product.*)")
    public void logWithinProduct() {
        System.out.println("product paketidagi metodga kirish loggingi...");
    }


//    @Before("execution(* uz.pdp.SingMusic.uzbekMusics(..))")
//    public void ovozniSozlash() {
//        System.out.println("🔔 [Before] qushiq aytishdan oldin ovozingizni sozlang...");
//    }
//
//    @Before("execution(* uz.pdp.Performance.perform(..))")
//    public void silencePhone() {
//        System.out.println("🔔 [Before] Telifonlaringizni ovozini o`chirib qo`ying");
//    }
//    @Before("execution(* uz.pdp.Performance.perform(..))")
//    public void silencePhone2() {
//        System.out.println("🔔 [Before] Telifonlaringizni ovozini o`chirib qo`ying 2");
//    }
//
//    @Before("execution(* uz.pdp.SingMusic.*(..))")
//    public void allBeforeSingMusic() {
//        System.out.println("🔔 [Before] SingMusic ******************");
//    }
//
//    @Before("execution(* uz.pdp.*.*(..))")
//    public void allBeforeAllClass() {
//        System.out.println("🔔 [Before] All Class ******************");
//    }
//
//    @Before("execution(* uz.pdp.Performance.*(..))")
//    public void allBefore() {
//        System.out.println("🔔 [Before] all ******************");
//    }
//
//    @After("execution(* uz.pdp.Performance.perform(..))")
//    public void qarsakChalish() {
//        System.out.println("✅ [After] 👏👏👏👏👏👏👏👏.");
//    }
//
//    @AfterReturning("execution(* uz.pdp.Performance.hello(..))")
//    public void afterReturning() {
//        System.out.println("[AfterReturning] Say hello completed successfully.");
//    }
//
//    @AfterThrowing("execution(* uz.pdp.Performance.perform(..))")
//    public void afterThrowing() {
//        System.out.println("🚨 [AfterThrowing] An error occurred during perform().");
//    }
//
//    @Around("execution(* uz.pdp.Performance.hello(..))")
//    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("🔄 [Around] Before actual hello logic");
//        Object result = joinPoint.proceed();
//        System.out.println("🔄 [Around] After actual hello logic");
//        return result;
//    }
}
