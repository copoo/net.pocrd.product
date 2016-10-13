package net.pocrd.product.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class DisplayLabel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.id
     *
     * @mbggenerated
     */
    /**  */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.owner
     *
     * @mbggenerated
     */
    /** (spu,sku,item)+{id} ä¸ºNULLæ—¶è¡¨ç¤ºæ˜¯å…±äº«åž‹æ ‡ç­¾ */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.name
     *
     * @mbggenerated
     */
    /** æ ‡ç­¾å */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.type
     *
     * @mbggenerated
     */
    /** æ ‡ç­¾ç±»åž‹ */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.data
     *
     * @mbggenerated
     */
    /** å¤æ‚æ•°æ®ç»“æž„ */
    private String data;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.res1_id
     *
     * @mbggenerated
     */
    /** èµ„æºid1 */
    private Integer res1Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.start_time
     *
     * @mbggenerated
     */
    /** å¼€å§‹å±•ç¤ºæ—¶é—´ */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.end_time
     *
     * @mbggenerated
     */
    /** ç»“æŸå±•ç¤ºæ—¶é—´ */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.created_at
     *
     * @mbggenerated
     */
    /** åˆ›å»ºæ—¶é—´ */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.modified_at
     *
     * @mbggenerated
     */
    /** æ›´æ–°æ—¶é—´ */
    private Date modifiedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_product_display_label.is_deleted
     *
     * @mbggenerated
     */
    /** è®°å½•æ˜¯å¦è¢«åˆ é™¤ */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mt_product_display_label
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.id
     *
     * @return the value of mt_product_display_label.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.id
     *
     * @param id the value for mt_product_display_label.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.owner
     *
     * @return the value of mt_product_display_label.owner
     *
     * @mbggenerated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.owner
     *
     * @param owner the value for mt_product_display_label.owner
     *
     * @mbggenerated
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.name
     *
     * @return the value of mt_product_display_label.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.name
     *
     * @param name the value for mt_product_display_label.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.type
     *
     * @return the value of mt_product_display_label.type
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.type
     *
     * @param type the value for mt_product_display_label.type
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.data
     *
     * @return the value of mt_product_display_label.data
     *
     * @mbggenerated
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.data
     *
     * @param data the value for mt_product_display_label.data
     *
     * @mbggenerated
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.res1_id
     *
     * @return the value of mt_product_display_label.res1_id
     *
     * @mbggenerated
     */
    public Integer getRes1Id() {
        return res1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.res1_id
     *
     * @param res1Id the value for mt_product_display_label.res1_id
     *
     * @mbggenerated
     */
    public void setRes1Id(Integer res1Id) {
        this.res1Id = res1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.start_time
     *
     * @return the value of mt_product_display_label.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.start_time
     *
     * @param startTime the value for mt_product_display_label.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.end_time
     *
     * @return the value of mt_product_display_label.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.end_time
     *
     * @param endTime the value for mt_product_display_label.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.created_at
     *
     * @return the value of mt_product_display_label.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.created_at
     *
     * @param createdAt the value for mt_product_display_label.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.modified_at
     *
     * @return the value of mt_product_display_label.modified_at
     *
     * @mbggenerated
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.modified_at
     *
     * @param modifiedAt the value for mt_product_display_label.modified_at
     *
     * @mbggenerated
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_product_display_label.is_deleted
     *
     * @return the value of mt_product_display_label.is_deleted
     *
     * @mbggenerated
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_product_display_label.is_deleted
     *
     * @param isDeleted the value for mt_product_display_label.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}