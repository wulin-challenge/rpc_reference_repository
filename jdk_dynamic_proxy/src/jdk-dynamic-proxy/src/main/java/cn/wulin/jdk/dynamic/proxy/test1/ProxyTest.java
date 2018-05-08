package cn.wulin.jdk.dynamic.proxy.test1;

/** 
 * 动态代理测试类 
 * @author zyb 
 * @since 2012-8-9 
 * 
 */  
public class ProxyTest {  
	public static void main(String[] args) throws Throwable {
		new ProxyTest().testProxy();
	}
  
    public void testProxy() throws Throwable {  
        // 实例化目标对象  
        UserService userService = new UserServiceImpl();  
          
        // 实例化InvocationHandler  
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);  
          
        // 根据目标对象生成代理对象  
        UserService proxy = (UserService) invocationHandler.getProxy();  
          
        // 调用代理对象的方法  
        proxy.add();  
        
        String update = proxy.update("123", "wulin");
        System.out.println("method update : "+update);
          
    }  
}  