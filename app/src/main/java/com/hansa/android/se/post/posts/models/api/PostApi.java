package com.hansa.android.se.post.posts.models.api;



import com.hansa.android.se.post.posts.models.post.Post;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
//    https://jsonplaceholder.typicode.com/

    @GET("/posts/15")
    Call<Post> getPost();
    

}
