IOC&DI
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}

AOP:

@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.lwh.aop.Action)")
    public void annotationMethod(){

    }
    @After("annotationMethod()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method m = signature.getMethod();
        Action action = m.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }

    @Before("execution(* com.lwh.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method m = signature.getMethod();
        System.out.println("方法式拦截"+m.getName());
    }
}
