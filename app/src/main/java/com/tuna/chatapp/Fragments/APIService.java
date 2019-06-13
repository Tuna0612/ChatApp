package com.tuna.chatapp.Fragments;

import com.tuna.chatapp.Notification.MyResponse;
import com.tuna.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAeYawPsE:APA91bGCi8GnUrOCthrTjY3i3m_dU72VcehJBVuf4XTmtTWqHgBqroZDaMiFufoukEHMeI7pZ6uT05BGk6ivrTrW-Ai_p4g8KsO3si5IabWm6OWhtyXAYUJWWIoBYMAbk0bCKbKBLA53"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
