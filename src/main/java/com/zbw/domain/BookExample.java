package com.zbw.domain;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNull() {
            addCriterion("book_publish is null");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNotNull() {
            addCriterion("book_publish is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublishEqualTo(String value) {
            addCriterion("book_publish =", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotEqualTo(String value) {
            addCriterion("book_publish <>", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThan(String value) {
            addCriterion("book_publish >", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThanOrEqualTo(String value) {
            addCriterion("book_publish >=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThan(String value) {
            addCriterion("book_publish <", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThanOrEqualTo(String value) {
            addCriterion("book_publish <=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLike(String value) {
            addCriterion("book_publish like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotLike(String value) {
            addCriterion("book_publish not like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishIn(List<String> values) {
            addCriterion("book_publish in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotIn(List<String> values) {
            addCriterion("book_publish not in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishBetween(String value1, String value2) {
            addCriterion("book_publish between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotBetween(String value1, String value2) {
            addCriterion("book_publish not between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIsNull() {
            addCriterion("book_category is null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIsNotNull() {
            addCriterion("book_category is not null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryEqualTo(Integer value) {
            addCriterion("book_category =", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryNotEqualTo(Integer value) {
            addCriterion("book_category <>", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryGreaterThan(Integer value) {
            addCriterion("book_category >", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_category >=", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryLessThan(Integer value) {
            addCriterion("book_category <", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("book_category <=", value, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIn(List<Integer> values) {
            addCriterion("book_category in", values, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryNotIn(List<Integer> values) {
            addCriterion("book_category not in", values, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryBetween(Integer value1, Integer value2) {
            addCriterion("book_category between", value1, value2, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("book_category not between", value1, value2, "bookCategory");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(Double value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(Double value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(Double value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(Double value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(Double value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<Double> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<Double> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(Double value1, Double value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(Double value1, Double value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionIsNull() {
            addCriterion("book_introduction is null");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionIsNotNull() {
            addCriterion("book_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionEqualTo(String value) {
            addCriterion("book_introduction =", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionNotEqualTo(String value) {
            addCriterion("book_introduction <>", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionGreaterThan(String value) {
            addCriterion("book_introduction >", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("book_introduction >=", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionLessThan(String value) {
            addCriterion("book_introduction <", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionLessThanOrEqualTo(String value) {
            addCriterion("book_introduction <=", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionLike(String value) {
            addCriterion("book_introduction like", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionNotLike(String value) {
            addCriterion("book_introduction not like", value, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionIn(List<String> values) {
            addCriterion("book_introduction in", values, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionNotIn(List<String> values) {
            addCriterion("book_introduction not in", values, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionBetween(String value1, String value2) {
            addCriterion("book_introduction between", value1, value2, "bookIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookIntroductionNotBetween(String value1, String value2) {
            addCriterion("book_introduction not between", value1, value2, "bookIntroduction");
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