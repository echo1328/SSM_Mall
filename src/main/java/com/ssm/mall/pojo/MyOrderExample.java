package com.ssm.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class MyOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_nameEqualTo(String value) {
            addCriterion("order_name =", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameGreaterThan(String value) {
            addCriterion("order_name >", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLessThan(String value) {
            addCriterion("order_name <", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLike(String value) {
            addCriterion("order_name like", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotLike(String value) {
            addCriterion("order_name not like", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIn(List<String> values) {
            addCriterion("order_name in", values, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "order_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numEqualTo(String value) {
            addCriterion("order_num =", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotEqualTo(String value) {
            addCriterion("order_num <>", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThan(String value) {
            addCriterion("order_num >", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThan(String value) {
            addCriterion("order_num <", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLike(String value) {
            addCriterion("order_num like", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotLike(String value) {
            addCriterion("order_num not like", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numIn(List<String> values) {
            addCriterion("order_num in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotIn(List<String> values) {
            addCriterion("order_num not in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_priceEqualTo(Double value) {
            addCriterion("total_price =", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotEqualTo(Double value) {
            addCriterion("total_price <>", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceGreaterThan(Double value) {
            addCriterion("total_price >", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_price >=", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceLessThan(Double value) {
            addCriterion("total_price <", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceLessThanOrEqualTo(Double value) {
            addCriterion("total_price <=", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIn(List<Double> values) {
            addCriterion("total_price in", values, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotIn(List<Double> values) {
            addCriterion("total_price not in", values, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceBetween(Double value1, Double value2) {
            addCriterion("total_price between", value1, value2, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotBetween(Double value1, Double value2) {
            addCriterion("total_price not between", value1, value2, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_amountEqualTo(Integer value) {
            addCriterion("total_amount =", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotEqualTo(Integer value) {
            addCriterion("total_amount <>", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountGreaterThan(Integer value) {
            addCriterion("total_amount >", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_amount >=", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountLessThan(Integer value) {
            addCriterion("total_amount <", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountLessThanOrEqualTo(Integer value) {
            addCriterion("total_amount <=", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIn(List<Integer> values) {
            addCriterion("total_amount in", values, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotIn(List<Integer> values) {
            addCriterion("total_amount not in", values, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountBetween(Integer value1, Integer value2) {
            addCriterion("total_amount between", value1, value2, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_amount not between", value1, value2, "total_amount");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andOrders_idsIsNull() {
            addCriterion("orders_ids is null");
            return (Criteria) this;
        }

        public Criteria andOrders_idsIsNotNull() {
            addCriterion("orders_ids is not null");
            return (Criteria) this;
        }

        public Criteria andOrders_idsEqualTo(String value) {
            addCriterion("orders_ids =", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsNotEqualTo(String value) {
            addCriterion("orders_ids <>", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsGreaterThan(String value) {
            addCriterion("orders_ids >", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsGreaterThanOrEqualTo(String value) {
            addCriterion("orders_ids >=", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsLessThan(String value) {
            addCriterion("orders_ids <", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsLessThanOrEqualTo(String value) {
            addCriterion("orders_ids <=", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsLike(String value) {
            addCriterion("orders_ids like", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsNotLike(String value) {
            addCriterion("orders_ids not like", value, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsIn(List<String> values) {
            addCriterion("orders_ids in", values, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsNotIn(List<String> values) {
            addCriterion("orders_ids not in", values, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsBetween(String value1, String value2) {
            addCriterion("orders_ids between", value1, value2, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andOrders_idsNotBetween(String value1, String value2) {
            addCriterion("orders_ids not between", value1, value2, "orders_ids");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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