package com.dockertest2;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class Contents {

	@Id @GeneratedValue
	private Long id;

	private String content;

	public Contents( String content ) {
		this.content = content;
	}

}
