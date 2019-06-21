package com.ssm.mall.test;

import com.ssm.mall.mapper.GoodsMapper;
import com.ssm.mall.pojo.Goods;
import com.ssm.mall.pojo.GoodsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/9 19:52
 */

@Component("SolrUtil")
public class SolrUtil {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private SolrTemplate solrTemplate;

    public void importGoodsData() {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        System.out.println("----商品列表----");
        for(Goods goods : goodsList) {
            System.out.println(goods.getName());
        }
        solrTemplate.saveBeans(goodsList);
        solrTemplate.commit();
        System.out.println("----结束----");
    }

    public void add() {
        Goods goods = new Goods();
        goods.setGoods_id(1);
        goods.setName("hhh");
        solrTemplate.saveBean(goods);
        solrTemplate.commit();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SolrUtil solrUtil = (SolrUtil) context.getBean("SolrUtil");
        solrUtil.importGoodsData();
        //solrUtil.add();
    }

}
