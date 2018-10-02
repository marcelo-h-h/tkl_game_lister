package com.example.marcelo.tkl_game_lister_app;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("s/1b7jlwii7jfvuh0/games")
    Call<Response> getJSON();
}
