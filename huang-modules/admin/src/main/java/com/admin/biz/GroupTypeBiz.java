package com.admin.biz;

import org.springframework.stereotype.Service;

import com.admin.entity.GroupType;
import com.admin.mapper.GroupTypeMapper;
import com.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
