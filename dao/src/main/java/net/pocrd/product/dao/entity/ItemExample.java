package net.pocrd.product.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected int offset = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected int rows = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void setOffset(int offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public int getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public void setRows(int rows) {
        this.rows=rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
    public int getRows() {
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andProductDescIdIsNull() {
            addCriterion("product_desc_id is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIdIsNotNull() {
            addCriterion("product_desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescIdEqualTo(Integer value) {
            addCriterion("product_desc_id =", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotEqualTo(Integer value) {
            addCriterion("product_desc_id <>", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdGreaterThan(Integer value) {
            addCriterion("product_desc_id >", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_desc_id >=", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdLessThan(Integer value) {
            addCriterion("product_desc_id <", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_desc_id <=", value, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdIn(List<Integer> values) {
            addCriterion("product_desc_id in", values, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotIn(List<Integer> values) {
            addCriterion("product_desc_id not in", values, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdBetween(Integer value1, Integer value2) {
            addCriterion("product_desc_id between", value1, value2, "productDescId");
            return (Criteria) this;
        }

        public Criteria andProductDescIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_desc_id not between", value1, value2, "productDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdIsNull() {
            addCriterion("specs_desc_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdIsNotNull() {
            addCriterion("specs_desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdEqualTo(Integer value) {
            addCriterion("specs_desc_id =", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdNotEqualTo(Integer value) {
            addCriterion("specs_desc_id <>", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdGreaterThan(Integer value) {
            addCriterion("specs_desc_id >", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("specs_desc_id >=", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdLessThan(Integer value) {
            addCriterion("specs_desc_id <", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdLessThanOrEqualTo(Integer value) {
            addCriterion("specs_desc_id <=", value, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdIn(List<Integer> values) {
            addCriterion("specs_desc_id in", values, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdNotIn(List<Integer> values) {
            addCriterion("specs_desc_id not in", values, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdBetween(Integer value1, Integer value2) {
            addCriterion("specs_desc_id between", value1, value2, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIdNotBetween(Integer value1, Integer value2) {
            addCriterion("specs_desc_id not between", value1, value2, "specsDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdIsNull() {
            addCriterion("support_desc_id is null");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdIsNotNull() {
            addCriterion("support_desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdEqualTo(Integer value) {
            addCriterion("support_desc_id =", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdNotEqualTo(Integer value) {
            addCriterion("support_desc_id <>", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdGreaterThan(Integer value) {
            addCriterion("support_desc_id >", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("support_desc_id >=", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdLessThan(Integer value) {
            addCriterion("support_desc_id <", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdLessThanOrEqualTo(Integer value) {
            addCriterion("support_desc_id <=", value, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdIn(List<Integer> values) {
            addCriterion("support_desc_id in", values, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdNotIn(List<Integer> values) {
            addCriterion("support_desc_id not in", values, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdBetween(Integer value1, Integer value2) {
            addCriterion("support_desc_id between", value1, value2, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andSupportDescIdNotBetween(Integer value1, Integer value2) {
            addCriterion("support_desc_id not between", value1, value2, "supportDescId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdIsNull() {
            addCriterion("main_image_id is null");
            return (Criteria) this;
        }

        public Criteria andMainImageIdIsNotNull() {
            addCriterion("main_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainImageIdEqualTo(Integer value) {
            addCriterion("main_image_id =", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdNotEqualTo(Integer value) {
            addCriterion("main_image_id <>", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdGreaterThan(Integer value) {
            addCriterion("main_image_id >", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_image_id >=", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdLessThan(Integer value) {
            addCriterion("main_image_id <", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_image_id <=", value, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdIn(List<Integer> values) {
            addCriterion("main_image_id in", values, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdNotIn(List<Integer> values) {
            addCriterion("main_image_id not in", values, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdBetween(Integer value1, Integer value2) {
            addCriterion("main_image_id between", value1, value2, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andMainImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_image_id not between", value1, value2, "mainImageId");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("resource is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("resource is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(String value) {
            addCriterion("resource =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(String value) {
            addCriterion("resource <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(String value) {
            addCriterion("resource >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(String value) {
            addCriterion("resource >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(String value) {
            addCriterion("resource <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(String value) {
            addCriterion("resource <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLike(String value) {
            addCriterion("resource like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotLike(String value) {
            addCriterion("resource not like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<String> values) {
            addCriterion("resource in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<String> values) {
            addCriterion("resource not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(String value1, String value2) {
            addCriterion("resource between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(String value1, String value2) {
            addCriterion("resource not between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andIsMutipleIsNull() {
            addCriterion("is_mutiple is null");
            return (Criteria) this;
        }

        public Criteria andIsMutipleIsNotNull() {
            addCriterion("is_mutiple is not null");
            return (Criteria) this;
        }

        public Criteria andIsMutipleEqualTo(Byte value) {
            addCriterion("is_mutiple =", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleNotEqualTo(Byte value) {
            addCriterion("is_mutiple <>", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleGreaterThan(Byte value) {
            addCriterion("is_mutiple >", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_mutiple >=", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleLessThan(Byte value) {
            addCriterion("is_mutiple <", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleLessThanOrEqualTo(Byte value) {
            addCriterion("is_mutiple <=", value, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleIn(List<Byte> values) {
            addCriterion("is_mutiple in", values, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleNotIn(List<Byte> values) {
            addCriterion("is_mutiple not in", values, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleBetween(Byte value1, Byte value2) {
            addCriterion("is_mutiple between", value1, value2, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andIsMutipleNotBetween(Byte value1, Byte value2) {
            addCriterion("is_mutiple not between", value1, value2, "isMutiple");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtIsNull() {
            addCriterion("modified_at is null");
            return (Criteria) this;
        }

        public Criteria andModifiedAtIsNotNull() {
            addCriterion("modified_at is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedAtEqualTo(Date value) {
            addCriterion("modified_at =", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtNotEqualTo(Date value) {
            addCriterion("modified_at <>", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtGreaterThan(Date value) {
            addCriterion("modified_at >", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_at >=", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtLessThan(Date value) {
            addCriterion("modified_at <", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtLessThanOrEqualTo(Date value) {
            addCriterion("modified_at <=", value, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtIn(List<Date> values) {
            addCriterion("modified_at in", values, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtNotIn(List<Date> values) {
            addCriterion("modified_at not in", values, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtBetween(Date value1, Date value2) {
            addCriterion("modified_at between", value1, value2, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andModifiedAtNotBetween(Date value1, Date value2) {
            addCriterion("modified_at not between", value1, value2, "modifiedAt");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mt_product_item
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mt_product_item
     *
     * @mbggenerated
     */
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