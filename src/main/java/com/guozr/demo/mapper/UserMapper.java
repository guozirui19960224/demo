package com.guozr.demo.mapper;

import com.guozr.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author : guozr
 * @date : 2021/7/2 14:09
 */
@Repository
public interface UserMapper {
    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    int insert(User entity);

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    int deleteById(Serializable id);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    int updateById(User entity);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    User selectById(Serializable id);

    List<User> selectList();
}