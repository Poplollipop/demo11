package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
@SpringBootTest // 先從程式入口點開始運作，會先完成程式的基本配置、再執行測試內容
=======
@SpringBootTest
>>>>>>> c1bf31048463ad85b4d7f284bd4bd07c8be58a75
class Demo11ApplicationTests {

	@Test
	void contextLoads() {
	}

<<<<<<< HEAD
	@Test
	public void interfaceTest(){
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM2);
	}

=======
>>>>>>> c1bf31048463ad85b4d7f284bd4bd07c8be58a75
}
