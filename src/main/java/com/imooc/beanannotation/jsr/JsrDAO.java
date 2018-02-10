package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Repository;

import javax.inject.Named;

//@Repository
@Named("jsrDAO1")
public class JsrDAO {
	
	public void save() {
		System.out.println("JsrDAO invoked.");
	}
	
}
