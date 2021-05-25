package com.restapi.msposts.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@ApiModel(description = "Post JPA Entity class")
@Entity
@Getter 
@Setter 
@Accessors(chain = true)
@NoArgsConstructor
public class Post implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(notes = "Post ID maps to Primary Key", example = "1", required = true, position = 0)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ApiModelProperty(notes = "Title of your Post", example = "Swagger", required = true, position = 1)
	@NotNull
	private String title;
	@ApiModelProperty(notes = "Content of your Post", example = "Post Description", required = true, position = 2)
	@NotNull
	private String content;
	@ApiModelProperty(notes = "Date when your Post is published", example = "2020-05-09", position = 3)
	private LocalDate publishdate;

}
