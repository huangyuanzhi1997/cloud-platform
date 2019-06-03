package com.admin.biz;

import com.admin.entity.ResourceAuthority;
import com.admin.mapper.ResourceAuthorityMapper;
import com.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
