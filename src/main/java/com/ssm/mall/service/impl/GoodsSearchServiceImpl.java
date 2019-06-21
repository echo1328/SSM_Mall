package com.ssm.mall.service.impl;

import com.ssm.mall.pojo.Goods;
import com.ssm.mall.service.GoodsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther wenlongzhou
 * @date 2019/6/10 14:00
 */

@Service
public class GoodsSearchServiceImpl implements GoodsSearchService {

    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    public Map search(Map searchMap) {
        System.out.println(searchMap.get("key"));
        Map map = new HashMap();
        Query query = new SimpleQuery("*:*");
        Criteria criteria = new Criteria("item_keywords").is(searchMap.get("key"));
        query.addCriteria(criteria);
        ScoredPage<Goods> page = solrTemplate.queryForPage(query, Goods.class);
        map.put("rows", page.getContent());
        return map;
    }

}
