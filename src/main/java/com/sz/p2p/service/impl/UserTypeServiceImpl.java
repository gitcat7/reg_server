package com.sz.p2p.service.impl;

import com.sz.p2p.entity.UserType;
import com.sz.p2p.dao.UserTypeMapper;
import com.sz.p2p.service.UserTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户类型表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class UserTypeServiceImpl extends ServiceImpl<UserTypeMapper, UserType> implements UserTypeService {

}
