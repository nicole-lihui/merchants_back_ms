package com.nicole.service;

import com.nicole.dao.mapper.GoodStatusMapper;
import com.nicole.dao.model.GoodStatusDO;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import static com.nicole.dao.mapper.GoodStatusDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class GoodStatusService {

    @Autowired
    private GoodStatusMapper goodStatusMapper;

    public String SelectName(Integer gsid) {
        String statusName = null;

//        SelectStatementProvider selectStatement = select(goodStatusDO.name)
//                .from(goodStatusDO)
//                .where(id, isEqualTo(gsid))
//                .build()
//                .render(RenderingStrategies.MYBATIS3);

        Optional<GoodStatusDO> op = goodStatusMapper.selectByPrimaryKey(gsid);
        return op.isPresent() ? op.get().getName() : null;
    }
}
