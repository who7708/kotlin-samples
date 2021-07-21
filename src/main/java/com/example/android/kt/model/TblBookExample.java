package com.example.android.kt.model;

import java.util.ArrayList;
import java.util.List;

public class TblBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblBookExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
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

        public Criteria andBookBriefIsNull() {
            addCriterion("book_brief is null");
            return (Criteria) this;
        }

        public Criteria andBookBriefIsNotNull() {
            addCriterion("book_brief is not null");
            return (Criteria) this;
        }

        public Criteria andBookBriefEqualTo(String value) {
            addCriterion("book_brief =", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotEqualTo(String value) {
            addCriterion("book_brief <>", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefGreaterThan(String value) {
            addCriterion("book_brief >", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefGreaterThanOrEqualTo(String value) {
            addCriterion("book_brief >=", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLessThan(String value) {
            addCriterion("book_brief <", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLessThanOrEqualTo(String value) {
            addCriterion("book_brief <=", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLike(String value) {
            addCriterion("book_brief like", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotLike(String value) {
            addCriterion("book_brief not like", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefIn(List<String> values) {
            addCriterion("book_brief in", values, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotIn(List<String> values) {
            addCriterion("book_brief not in", values, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefBetween(String value1, String value2) {
            addCriterion("book_brief between", value1, value2, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotBetween(String value1, String value2) {
            addCriterion("book_brief not between", value1, value2, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNull() {
            addCriterion("book_isbn is null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNotNull() {
            addCriterion("book_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnEqualTo(String value) {
            addCriterion("book_isbn =", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotEqualTo(String value) {
            addCriterion("book_isbn <>", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThan(String value) {
            addCriterion("book_isbn >", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("book_isbn >=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThan(String value) {
            addCriterion("book_isbn <", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThanOrEqualTo(String value) {
            addCriterion("book_isbn <=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLike(String value) {
            addCriterion("book_isbn like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotLike(String value) {
            addCriterion("book_isbn not like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIn(List<String> values) {
            addCriterion("book_isbn in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotIn(List<String> values) {
            addCriterion("book_isbn not in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnBetween(String value1, String value2) {
            addCriterion("book_isbn between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotBetween(String value1, String value2) {
            addCriterion("book_isbn not between", value1, value2, "bookIsbn");
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

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(Long value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(Long value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(Long value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(Long value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(Long value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<Long> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<Long> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(Long value1, Long value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(Long value1, Long value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIsNull() {
            addCriterion("book_publish_date is null");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIsNotNull() {
            addCriterion("book_publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateEqualTo(String value) {
            addCriterion("book_publish_date =", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotEqualTo(String value) {
            addCriterion("book_publish_date <>", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateGreaterThan(String value) {
            addCriterion("book_publish_date >", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateGreaterThanOrEqualTo(String value) {
            addCriterion("book_publish_date >=", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLessThan(String value) {
            addCriterion("book_publish_date <", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLessThanOrEqualTo(String value) {
            addCriterion("book_publish_date <=", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateLike(String value) {
            addCriterion("book_publish_date like", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotLike(String value) {
            addCriterion("book_publish_date not like", value, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateIn(List<String> values) {
            addCriterion("book_publish_date in", values, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotIn(List<String> values) {
            addCriterion("book_publish_date not in", values, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateBetween(String value1, String value2) {
            addCriterion("book_publish_date between", value1, value2, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublishDateNotBetween(String value1, String value2) {
            addCriterion("book_publish_date not between", value1, value2, "bookPublishDate");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIsNull() {
            addCriterion("book_publisher is null");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIsNotNull() {
            addCriterion("book_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublisherEqualTo(String value) {
            addCriterion("book_publisher =", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotEqualTo(String value) {
            addCriterion("book_publisher <>", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherGreaterThan(String value) {
            addCriterion("book_publisher >", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("book_publisher >=", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLessThan(String value) {
            addCriterion("book_publisher <", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLessThanOrEqualTo(String value) {
            addCriterion("book_publisher <=", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLike(String value) {
            addCriterion("book_publisher like", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotLike(String value) {
            addCriterion("book_publisher not like", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIn(List<String> values) {
            addCriterion("book_publisher in", values, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotIn(List<String> values) {
            addCriterion("book_publisher not in", values, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherBetween(String value1, String value2) {
            addCriterion("book_publisher between", value1, value2, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotBetween(String value1, String value2) {
            addCriterion("book_publisher not between", value1, value2, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIsNull() {
            addCriterion("book_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIsNotNull() {
            addCriterion("book_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdEqualTo(String value) {
            addCriterion("book_type_id =", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotEqualTo(String value) {
            addCriterion("book_type_id <>", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThan(String value) {
            addCriterion("book_type_id >", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_type_id >=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThan(String value) {
            addCriterion("book_type_id <", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThanOrEqualTo(String value) {
            addCriterion("book_type_id <=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLike(String value) {
            addCriterion("book_type_id like", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotLike(String value) {
            addCriterion("book_type_id not like", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIn(List<String> values) {
            addCriterion("book_type_id in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotIn(List<String> values) {
            addCriterion("book_type_id not in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdBetween(String value1, String value2) {
            addCriterion("book_type_id between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotBetween(String value1, String value2) {
            addCriterion("book_type_id not between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookCountIsNull() {
            addCriterion("book_count is null");
            return (Criteria) this;
        }

        public Criteria andBookCountIsNotNull() {
            addCriterion("book_count is not null");
            return (Criteria) this;
        }

        public Criteria andBookCountEqualTo(Integer value) {
            addCriterion("book_count =", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountNotEqualTo(Integer value) {
            addCriterion("book_count <>", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountGreaterThan(Integer value) {
            addCriterion("book_count >", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_count >=", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountLessThan(Integer value) {
            addCriterion("book_count <", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountLessThanOrEqualTo(Integer value) {
            addCriterion("book_count <=", value, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountIn(List<Integer> values) {
            addCriterion("book_count in", values, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountNotIn(List<Integer> values) {
            addCriterion("book_count not in", values, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountBetween(Integer value1, Integer value2) {
            addCriterion("book_count between", value1, value2, "bookCount");
            return (Criteria) this;
        }

        public Criteria andBookCountNotBetween(Integer value1, Integer value2) {
            addCriterion("book_count not between", value1, value2, "bookCount");
            return (Criteria) this;
        }
    }

    /**
     */
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