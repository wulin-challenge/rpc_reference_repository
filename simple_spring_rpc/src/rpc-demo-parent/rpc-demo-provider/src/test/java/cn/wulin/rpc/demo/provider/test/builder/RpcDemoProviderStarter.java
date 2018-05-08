package cn.wulin.rpc.demo.provider.test.builder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcDemoProviderStarter {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 new ClassPathXmlApplicationContext("META-INF/spring/module-rpc-demo-provider.xml");
	}

}
