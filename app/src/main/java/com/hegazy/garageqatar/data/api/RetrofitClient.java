package com.hegazy.garageqatar.data.api;

import java.util.concurrent.TimeUnit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class RetrofitClient {

  private static Retrofit retrofit=null;
  private static String BASE_URL="https://api.yallsa.org/";
  private static okhttp3.OkHttpClient okHttpClient;

  public static ApiServes getClient(){
    okhttp3.OkHttpClient innerClient = new okhttp3.OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
            .writeTimeout(1, TimeUnit.MINUTES) // write timeout
            .readTimeout(1, TimeUnit.MINUTES) // read timeout
            .build();

    if (retrofit == null){
      retrofit=new Retrofit.Builder()
              .baseUrl(BASE_URL)
              .addConverterFactory(ScalarsConverterFactory.create())
              .addConverterFactory(GsonConverterFactory.create())
              .client(innerClient)
              .build();
    }
    return retrofit.create(ApiServes.class);
  }
}

