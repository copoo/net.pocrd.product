package net.pocrd.product.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Spu_Attribute implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.id
     *
     * @mbggenerated
     */
    /**  */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.ref_cate_back_id
     *
     * @mbggenerated
     */
    /** ç›¸å…³åŽå°ç±»ç›®å¶èŠ‚ç‚¹id */
    private Integer refCateBackId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.spu_id
     *
     * @mbggenerated
     */
    /**  */
    private Integer spuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.attr_id
     *
     * @mbggenerated
     */
    /**  */
    private Integer attrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.rank
     *
     * @mbggenerated
     */
    /** æŽ’åºæƒé‡ */
    private Integer rank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mtr_product_spu_attr.created_at
     *
     * @mbggenerated
     */
    /** åˆ›å»ºæ—¶é—´ */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mtr_product_spu_attr
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.id
     *
     * @return the value of mtr_product_spu_attr.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.id
     *
     * @param id the value for mtr_product_spu_attr.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.ref_cate_back_id
     *
     * @return the value of mtr_product_spu_attr.ref_cate_back_id
     *
     * @mbggenerated
     */
    public Integer getRefCateBackId() {
        return refCateBackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.ref_cate_back_id
     *
     * @param refCateBackId the value for mtr_product_spu_attr.ref_cate_back_id
     *
     * @mbggenerated
     */
    public void setRefCateBackId(Integer refCateBackId) {
        this.refCateBackId = refCateBackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.spu_id
     *
     * @return the value of mtr_product_spu_attr.spu_id
     *
     * @mbggenerated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.spu_id
     *
     * @param spuId the value for mtr_product_spu_attr.spu_id
     *
     * @mbggenerated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.attr_id
     *
     * @return the value of mtr_product_spu_attr.attr_id
     *
     * @mbggenerated
     */
    public Integer getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.attr_id
     *
     * @param attrId the value for mtr_product_spu_attr.attr_id
     *
     * @mbggenerated
     */
    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.rank
     *
     * @return the value of mtr_product_spu_attr.rank
     *
     * @mbggenerated
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.rank
     *
     * @param rank the value for mtr_product_spu_attr.rank
     *
     * @mbggenerated
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mtr_product_spu_attr.created_at
     *
     * @return the value of mtr_product_spu_attr.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mtr_product_spu_attr.created_at
     *
     * @param createdAt the value for mtr_product_spu_attr.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}