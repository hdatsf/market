package com.hdong.upms.rpc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdong.common.annotation.BaseService;
import com.hdong.common.base.BaseServiceImpl;
import com.hdong.upms.dao.mapper.UpmsLogMapper;
import com.hdong.upms.dao.model.UpmsLog;
import com.hdong.upms.dao.model.UpmsLogExample;
import com.hdong.upms.rpc.api.UpmsLogService;

/**
* UpmsLogService实现
* Created by hdong on 2017/3/20.
*/
@Service
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

    @Override
    public Logger getLogger() {
        return _log;
    }
}