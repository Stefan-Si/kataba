package com.qfedu.service;

import com.qfedu.entity.User;
import com.qfedu.vo.R;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:19
 * description:
 */

public interface UserService {
    R<List<User>> All();
}
