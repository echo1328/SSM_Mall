package com.ssm.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSeller_idIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSeller_idIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeller_idEqualTo(Integer value) {
            addCriterion("seller_id =", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(Integer value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idIn(List<Integer> values) {
            addCriterion("seller_id in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_nameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSeller_nameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeller_nameEqualTo(String value) {
            addCriterion("seller_name =", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameGreaterThan(String value) {
            addCriterion("seller_name >", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameLessThan(String value) {
            addCriterion("seller_name <", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameLike(String value) {
            addCriterion("seller_name like", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameNotLike(String value) {
            addCriterion("seller_name not like", value, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameIn(List<String> values) {
            addCriterion("seller_name in", values, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "seller_name");
            return (Criteria) this;
        }

        public Criteria andSeller_nameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "seller_name");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Double value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Double value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Double value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Double value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Double value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Double> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Double> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Double value1, Double value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Double value1, Double value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andShop_idsIsNull() {
            addCriterion("shop_ids is null");
            return (Criteria) this;
        }

        public Criteria andShop_idsIsNotNull() {
            addCriterion("shop_ids is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idsEqualTo(String value) {
            addCriterion("shop_ids =", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsNotEqualTo(String value) {
            addCriterion("shop_ids <>", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsGreaterThan(String value) {
            addCriterion("shop_ids >", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_ids >=", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsLessThan(String value) {
            addCriterion("shop_ids <", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsLessThanOrEqualTo(String value) {
            addCriterion("shop_ids <=", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsLike(String value) {
            addCriterion("shop_ids like", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsNotLike(String value) {
            addCriterion("shop_ids not like", value, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsIn(List<String> values) {
            addCriterion("shop_ids in", values, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsNotIn(List<String> values) {
            addCriterion("shop_ids not in", values, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsBetween(String value1, String value2) {
            addCriterion("shop_ids between", value1, value2, "shop_ids");
            return (Criteria) this;
        }

        public Criteria andShop_idsNotBetween(String value1, String value2) {
            addCriterion("shop_ids not between", value1, value2, "shop_ids");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}