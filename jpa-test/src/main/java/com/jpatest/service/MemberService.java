package com.jpatest.service;

import javax.persistence.EntityManagerFactory;

import com.jpatest.entity.Member;
import com.jpatest.entity.emf.UniqueEntityManagerFactory;

public class MemberService {
	
	public void save(Member member) {
		//엔티티 매니저 팩토리: 애플리케이션 당 하나
		EntityManagerFactory emf = UniqueEntityManagerFactory.emf;
	}
}
