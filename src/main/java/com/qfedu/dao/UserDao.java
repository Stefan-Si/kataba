package com.qfedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.entity.User;
import org.springframework.stereotype.Repository;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:13
 * description:
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}
