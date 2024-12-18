package com.xc.mybatis_study_progress_newbie.pojo;

import lombok.*;
import org.apache.ibatis.annotations.ConstructorArgs;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
}
