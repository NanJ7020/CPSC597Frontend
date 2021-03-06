package com.example.pooptest.Services;

import com.example.pooptest.Models.BackEndRequest.PostAddRequest;

import com.example.pooptest.Models.BackEndResponse.GetAllPostResponse;
import com.example.pooptest.Models.Post;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PostService {
    @GET("/api/posts")
    Call<GetAllPostResponse> getAllPosts();

    @POST("/api/posts")
    Call<Post> createPost(@Header("x-auth-token") String authToken,
                          @Body PostAddRequest postAddRequest);

    @GET("/api/posts/user/{user_id}")
    Call<GetAllPostResponse> getMyPosts(@Path("user_id") String user_id);

    @DELETE("/api/posts/post/{post_id}")
    Call<Post> deletePostByPostID(@Path("post_id") String post_id,
                                  @Header("x-auth-token") String authToken);

    @PUT("/api/posts/useful/{post_id}")
    Call<Post> takeCareBunny(@Path("post_id") String post_id,
                             @Header("x-auth-token") String authToken);

    @PUT("/api/posts/spay_neutere/{post_id}")
    Call<Post> spayorneut(@Path("post_id") String post_id,
                          @Header("x-auth-token") String authToken);

    @PUT("/api/posts/nailTrim/{post_id}")
    Call<Post> nailTrim(@Path("post_id") String post_id,
                        @Header("x-auth-token") String authToken);

    @PUT("/api/posts/fleaCheck/{post_id}")
    Call<Post> fleaCheck(@Path("post_id") String post_id,
                         @Header("x-auth-token") String authToken);


    @PUT("/api/posts/laboratory/{post_id}")
    Call<Post> laboratory(@Path("post_id") String post_id,
                          @Header("x-auth-token") String authToken);

    @PUT("/api/posts/GI_stasis/{post_id}")
    Call<Post> GIstasis(@Path("post_id") String post_id,
                        @Header("x-auth-token") String authToken);

}
