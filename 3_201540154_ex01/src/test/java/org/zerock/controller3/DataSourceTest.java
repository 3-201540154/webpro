package org.zerock.controller3;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {

	@Inject
	private DataSource ds; // ds라는 이름으로 객체 생성 받음 데이터소스를
	
	@Test
	public void testConection()throws Exception{ //드라이버 안에 있는 것을 실행.
		
		try(Connection con = ds.getConnection()){
			
			System.out.println(con); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


