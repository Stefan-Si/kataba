package com.qfedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:14
 * description:
 */
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO )
    private Integer id;
    private String phone;
    private String nickname;
    private String password;
    private int flag;

}
