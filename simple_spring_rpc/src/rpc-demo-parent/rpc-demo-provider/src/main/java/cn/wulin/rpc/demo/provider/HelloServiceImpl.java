package cn.wulin.rpc.demo.provider;

import com.xxx.rpc.server.RpcService;

import cn.wulin.rpc.demo.api.HelloService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}