package pers.hao.scts.tms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.hao.scts.common.util.PageUtils;
import pers.hao.scts.common.util.Query;
import pers.hao.scts.tms.service.ProfessionService;
import pers.hao.scts.tms.dao.ProfessionDao;
import pers.hao.scts.tms.entity.ProfessionEntity;


@Service("professionService")
public class ProfessionServiceImpl extends ServiceImpl<ProfessionDao, ProfessionEntity> implements ProfessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProfessionEntity> page = this.page(
                new Query<ProfessionEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}