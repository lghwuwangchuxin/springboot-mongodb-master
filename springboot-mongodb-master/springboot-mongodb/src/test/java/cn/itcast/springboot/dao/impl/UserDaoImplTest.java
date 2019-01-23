package cn.itcast.springboot.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongodb.DBCursor;

import cn.itcast.springboot.dao.UserDao;
import cn.itcast.springboot.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoImplTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void save() {
		User user = new User(1234L, "张三", 12, "男", "北京1");
		userDao.save(user);
	}

	@Test
	public void update() {
		User user = new User(123L, "李四", 12, "男", "广州");
		userDao.update(user);
	}

	@Test
	public void deleteById() {
		userDao.deleteById(123L);
	}

	@Test
	public void findById() {
		User user = userDao.findById(123L);
		System.out.println(user);
	}

	@Test
	public void findAll() {
		List<User> userList = userDao.findAll();
		if (userList != null && userList.size() > 0) {
			for (User user : userList) {
				System.out.println(user);
			}
		}
	}

	@Test
	public void findByName() {
		List<User> userList = userDao.findByName("张三");
		if (userList != null && userList.size() > 0) {
			for (User user : userList) {
				System.out.println(user);
			}
		}
	}
	@Test  
	/** 
	 * 分页查询    
	 */  
	public void pageQuery() {  

	}  
}