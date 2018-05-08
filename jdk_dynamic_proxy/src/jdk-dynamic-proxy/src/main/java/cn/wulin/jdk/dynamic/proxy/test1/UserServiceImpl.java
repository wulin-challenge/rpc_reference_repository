package cn.wulin.jdk.dynamic.proxy.test1;
/** 
 * 目标对象 
 * @author zyb 
 * @since 2012-8-9 
 * 
 */  
public class UserServiceImpl implements UserService {  
  
    /* (non-Javadoc) 
     * @see dynamic.proxy.UserService#add() 
     */  
    public void add() {  
        System.out.println("--------------------add---------------");  
    }

	@Override
	public String update(String id, String username) {
		String out ="id : "+id+" , username : "+username;
		System.out.println(out);
		return out;
	}  
} 