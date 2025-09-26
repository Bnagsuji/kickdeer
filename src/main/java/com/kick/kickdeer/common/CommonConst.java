package com.kick.kickdeer.common;

import org.springframework.stereotype.Component;

@Component
public class CommonConst {

    //회원 GET 허용
    private final String[] PERMIT_ALL_GET_ARRAY = {

    };

    //회원 POST 허용
    private final String[] PERMIT_ALL_POST_ARRAY = {
            "/api/complaint/catchDeer"
    };




    //ADMIN GET 허용
    private final String[] PERMIT_ADMIN_GET_ARRAY = {
           "/api/complaint/admin"
    };





}
