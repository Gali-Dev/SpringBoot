package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // User클래스가 MySQL에 테이블 생성
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@DynamicInsert // null 값을 제외하고 insert
public class User {

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //DB의 넘버링 전략을 따라감(mysql)
	private int id;
	
	@Column(nullable = false,length = 30, unique = true)
	private String username;
	@Column(nullable = false,length = 100)
	private String password;
	@Column(nullable = false,length = 50)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum(전략) 을 쓰는게 좋음 // 권한 (admin, user, manager)
	@CreationTimestamp // 시간 자동 입력
	private Timestamp createDate;
	
}
