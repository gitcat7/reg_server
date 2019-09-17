package com.sz.p2p.service.impl;

import com.sz.p2p.entity.Bank;
import com.sz.p2p.dao.BankMapper;
import com.sz.p2p.service.BankService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 银行表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank> implements BankService {

}
