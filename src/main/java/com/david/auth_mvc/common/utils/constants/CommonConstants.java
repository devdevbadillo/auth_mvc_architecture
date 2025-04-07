package com.david.auth_mvc.common.utils.constants;

public class CommonConstants {
    public static final String PUBLIC_URL = "/api/v1";
    public static final String SECURE_URL = PUBLIC_URL + "/app";
    public static final String ROLE_USER = "USER";
    public static final String SIGN_IN_FRONT_URL = "/auth/sign-in";
    public static final String AUTH_SOCIAL_MEDIA_FRONT_URL = "http://localhost:4200/auth/social-media";


    // Expiration token in minutes and days
    public static final Integer EXPIRATION_ACCESS_TOKEN_MINUTES = 60;
    public static final Integer EXPIRATION_REFRESH_TOKEN_DAYS = 7;
    public static final Integer EXPIRATION_ERROR_TOKEN_SECONDS = 10;

    // Type token
    public static final String TYPE_ACCESS_TOKEN = "access_token";
    public static final String TYPE_REFRESH_TOKEN = "refresh_token";
    public static final String TYPE_ERROR_TOKEN= "error";
}
