package com.example.football_0132;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/v1/json/1/eventspastleague.php")
    Call<MatchResponse> getLastMatch(@Query("id") String id);

    @GET("api/v1/json/1/eventsnextleague.php")
    Call<MatchResponse> getNextMatch(@Query("id") String id);

}