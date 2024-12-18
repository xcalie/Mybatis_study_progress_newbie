package com.xc.mybatis_study_progress_newbie.pojo;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;// 1:男, 2:女
    private String image;
    private Short job; // 1:班主任, 2:讲师, 3:学工主管， 4:教研主管， 5：咨询师
    private LocalDateTime entrydate;// 入职时间
    private Integer deptId;// 部门id
    private LocalDateTime createTime;// 创建时间
    private LocalDateTime updateTime;// 更新时间

}
