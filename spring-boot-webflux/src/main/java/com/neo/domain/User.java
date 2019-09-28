/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package com.neo.domain;

import lombok.Data;

/**
 * User
 *
 * @author dahe
 * @date 2019/9/28
 */
@Data
public class User {
    private String id;
    private String name;
    private String email;
}
