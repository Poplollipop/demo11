package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 先從程式入口點開始運作，會先完成程式的基本配置、再執行測試內容
class Demo11ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void interfaceTest(){
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM2);
	}

}
