package org.simpumind.com.retrofitandroidbasic.Api;

import org.simpumind.com.retrofitandroidbasic.Model.GitModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by simpumind on 3/19/16.
 */
public interface GitApi {

    @GET("/users/{user}")      //here is the other url part.best way is to start using /

     void getFeed(
            @Path("user")
            String user,
            Callback<GitModel> response);
}
