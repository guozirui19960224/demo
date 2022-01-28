package com.guozr.demo.service;

import com.guozr.demo.entity.User;
import com.guozr.demo.mapper.UserMapper;
import com.guozr.demo.service.inter.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @author : guozr
 * @date : 2021/7/2 14:23
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    public int insert(User entity) {
        return userMapper.insert(entity);
    }

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    public int deleteById(Serializable id) {
        return userMapper.deleteById(id);
    }

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    public int updateById(User entity) {
        return userMapper.updateById(entity);
    }

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    @Master
    public User selectById(Serializable id) {
        return userMapper.selectById(id);
    }

    public List<User> selectList() {
        return userMapper.selectList();
    }
}
