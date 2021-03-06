package net.pocrd.product.dao.mapper;

import java.util.List;
import net.pocrd.product.dao.entity.Sku;
import net.pocrd.product.dao.entity.SkuExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @SelectProvider(type=SkuSqlProvider.class, method="countByExample")
    int countByExample(SkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @DeleteProvider(type=SkuSqlProvider.class, method="deleteByExample")
    int deleteByExample(SkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @Delete({
        "delete from mt_product_sku",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @Insert({
        "insert into mt_product_sku (id, spu_id, ",
        "cate_back_id, cate_front, ",
        "brand_id, type, title, ",
        "subtitle, product_desc_id, ",
        "specs_desc_id, support_desc_id, ",
        "main_image_id, resource, ",
        "status, created_at, ",
        "modified_at, is_deleted)",
        "values (#{id,jdbcType=INTEGER}, #{spuId,jdbcType=INTEGER}, ",
        "#{cateBackId,jdbcType=INTEGER}, #{cateFront,jdbcType=VARCHAR}, ",
        "#{brandId,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{subtitle,jdbcType=VARCHAR}, #{productDescId,jdbcType=INTEGER}, ",
        "#{specsDescId,jdbcType=INTEGER}, #{supportDescId,jdbcType=INTEGER}, ",
        "#{mainImageId,jdbcType=INTEGER}, #{resource,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{modifiedAt,jdbcType=TIMESTAMP}, #{isDeleted,jdbcType=TINYINT})"
    })
    int insert(Sku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @InsertProvider(type=SkuSqlProvider.class, method="insertSelective")
    int insertSelective(Sku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @SelectProvider(type=SkuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="spu_id", property="spuId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_back_id", property="cateBackId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_front", property="cateFront", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="subtitle", property="subtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_desc_id", property="productDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="specs_desc_id", property="specsDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="support_desc_id", property="supportDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="main_image_id", property="mainImageId", jdbcType=JdbcType.INTEGER),
        @Result(column="resource", property="resource", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    List<Sku> selectByExample(SkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, spu_id, cate_back_id, cate_front, brand_id, type, title, subtitle, product_desc_id, ",
        "specs_desc_id, support_desc_id, main_image_id, resource, status, created_at, ",
        "modified_at, is_deleted",
        "from mt_product_sku",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="spu_id", property="spuId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_back_id", property="cateBackId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_front", property="cateFront", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="subtitle", property="subtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_desc_id", property="productDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="specs_desc_id", property="specsDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="support_desc_id", property="supportDescId", jdbcType=JdbcType.INTEGER),
        @Result(column="main_image_id", property="mainImageId", jdbcType=JdbcType.INTEGER),
        @Result(column="resource", property="resource", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    Sku selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SkuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sku record, @Param("example") SkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SkuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sku record, @Param("example") SkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SkuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    @Update({
        "update mt_product_sku",
        "set spu_id = #{spuId,jdbcType=INTEGER},",
          "cate_back_id = #{cateBackId,jdbcType=INTEGER},",
          "cate_front = #{cateFront,jdbcType=VARCHAR},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "subtitle = #{subtitle,jdbcType=VARCHAR},",
          "product_desc_id = #{productDescId,jdbcType=INTEGER},",
          "specs_desc_id = #{specsDescId,jdbcType=INTEGER},",
          "support_desc_id = #{supportDescId,jdbcType=INTEGER},",
          "main_image_id = #{mainImageId,jdbcType=INTEGER},",
          "resource = #{resource,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "modified_at = #{modifiedAt,jdbcType=TIMESTAMP},",
          "is_deleted = #{isDeleted,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sku record);
}