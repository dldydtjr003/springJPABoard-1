package com.board.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@SequenceGenerator(name = "JPABOARD_SEQ_GEN", sequenceName = "JPABOARD_SEQ", initialValue = 1, allocationSize = 1)
@Entity
@Table(name = "JPABOARD")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JPABOARD_SEQ_GEN")
	@Column(name ="NO")
	private Long no;
	@Column(name ="TITLE")
	private String title;
	@Column(name ="CONTENT")
	private String content;
	@Column(name ="WRITER")
	private String writer;
	@Column(name ="REGDATE")
	private Date regDate;
}
