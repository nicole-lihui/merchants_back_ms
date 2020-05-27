package com.nicole.service;

import com.nicole.dao.mapper.GoodMapper;
import com.nicole.dao.model.GoodDO;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.nicole.dao.mapper.GoodDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class GoodsService {

    @Autowired
    private GoodMapper goodMapper;

    public List<GoodDO> selectMany(Integer gShopId) {
        SelectStatementProvider selectStatement = select(goodDO.allColumns())
                .from(goodDO)
                .where(shopId, isEqualTo(gShopId))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return goodMapper.selectMany(selectStatement);
    }

    public List<GoodDO> selectMany(Integer gShopId, Integer lstatus) {
        SelectStatementProvider selectStatement = select(goodDO.allColumns())
                .from(goodDO)
                .where(shopId, isEqualTo(gShopId))
                .and(status, isEqualTo(lstatus))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return goodMapper.selectMany(selectStatement);
    }

    public GoodDO selectOne(Integer gid) {
        Optional<GoodDO> op = goodMapper.selectOne(c -> c.where(id, isEqualTo(gid)));

        return op.isPresent() ? op.get() : null;
    }

    //    insert
    public int insertGood(GoodDO good) {
        if (good == null)
            return 0;

        int row = 0;
        try {
            row = goodMapper.insert(good);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return row;
    }

    //    update
    public int updateGood(Integer gid, GoodDO good) {
        if (gid == null || good == null)
            return 0;

        UpdateStatementProvider updateStatement = update(goodDO)
                .set(icon).equalTo(good.getIcon())
                .set(title).equalTo(good.getTitle())
                .set(type).equalTo(good.getType())
                .set(status).equalTo(good.getStatus())
                .set(count).equalTo(good.getCount())
                .set(price).equalTo(good.getPrice())
                .where(id, isEqualTo(gid))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        int row = 0;
        try {
            row = goodMapper.update(updateStatement);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return row;
    }

    public int updateStatus(Integer gid, Integer gstatus) {
        if (gid == null || gstatus == null)
            return 0;

        int row = 0;
        try {
            row = goodMapper.update(c -> c.set(status).equalTo(gstatus).where(id, isEqualTo(gid)));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return row;
    }

    //    delete
    public int deleteGood(Integer gid) {
        if (gid == null)
            return 0;

        int row = 0;
        try {
            row = goodMapper.delete(c -> c.where(id, isEqualTo(gid)));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return row;
    }

}
