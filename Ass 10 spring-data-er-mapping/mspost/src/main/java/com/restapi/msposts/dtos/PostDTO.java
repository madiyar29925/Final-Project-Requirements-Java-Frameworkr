package com.restapi.msposts.dtos;

import java.time.LocalDate;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@ApiModel(description = "Post Data Transfer Object class")
@Getter 
@Setter 
@Accessors(chain = true)
@NoArgsConstructor
public class PostDTO {

	@ApiModelProperty(notes = "Post Title", required = true, example = "Swagger Annotations",  position = 0)
	@NotBlank
	@Size(max = 50)
	private String title;
	@ApiModelProperty(notes = "Post Content", required = true, example = "Post about how to document a Spring Boot REST API with Swagger ...", position = 1)
	@NotBlank
	private String content;
	@ApiModelProperty(notes = "Post Publish Date",example = "2020-05-09", position = 2)
	@DateTimeFormat(iso = ISO.DATE)
	@FutureOrPresent
	private LocalDate publishdate;

}
