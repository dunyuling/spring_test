package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Named
public class JsrService {
	
//	@Resource
//	@Inject
//	@Autowired
	private JsrDAO jsrDAO;
	
//	@Resource
	@Inject
//	@Autowired
	public void setJsrDAO(@Named("jsrDAO1") JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}

//	@PostConstruct
//	public void init() {
//		System.out.println("JsrService init.");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("JsrService destroy.");
//	}

	public void save() {
		jsrDAO.save();
	}
	
}
