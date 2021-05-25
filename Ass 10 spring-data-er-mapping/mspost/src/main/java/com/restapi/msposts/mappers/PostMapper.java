package com.restapi.msposts.mappers;

import com.restapi.msposts.dtos.PostDTO;
import com.restapi.msposts.models.Post;

public class PostMapper {

	public static Post postDtoTopost(PostDTO postdto) {
		return new Post()
				.setTitle(postdto.getTitle())
				.setContent(postdto.getContent())
				.setPublishdate(postdto.getPublishdate());
	}
	
	public static PostDTO postToPost(Post post) {
			return new PostDTO()
					.setTitle(post.getTitle())
					.setContent(post.getContent())
					.setPublishdate(post.getPublishdate());
	}

}
