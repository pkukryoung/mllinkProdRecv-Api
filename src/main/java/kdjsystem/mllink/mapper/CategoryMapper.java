package kdjsystem.mllink.mapper;

import kdjsystem.mllink.dto.ProdAttr.ProdAttrInf;
import kdjsystem.mllink.dto.category.CategoryInf;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("SELECT ID, NAME, PARENT_CODE, FULL_NAME, LEVEL, SHOPCATE, DOMECATG FROM CATEGORY WHERE ID = #{esCid} ")
    CategoryInf.ResponseCateMapInf findByCategory(@Param("esCid") String esCid);

    @Update("UPDATE CATEGORY SET SHOPCATE=#{shopcate}, DOMECATG=#{domecatg} WHERE ID=#{id} ")
    int updateCategory(@Param("id") String id, @Param("domecatg") String domecatg,@Param("shopcate") String shopcate);

    @Select("SELECT ID, NAME, PARENT_CODE, FULL_NAME, LEVEL, SHOPCATE, DOMECATG FROM CATEGORY LIMIT 1000 OFFSET #{page} ")
    List<CategoryInf.ResponseCateMapInf> findByCategoryMap(@Param("page") int page);

    @Select("SELECT count(*) FROM CATEGORY ")
    int findByCategoryMapTotalPage();

    @Select("SELECT SHOPCD, CODE, SHOPCATENM, ESMCODE, ESMSHOPCATENM FROM SHOPCATEGORYS WHERE SHOPCD=#{shopcd} LIMIT 1000 OFFSET #{page} ")
    List<CategoryInf.ResponseMallCategory> findByMallCategory(@Param("shopcd") String shopcd, @Param("page") int page);

    @Select("SELECT count(*) FROM SHOPCATEGORYS WHERE SHOPCD=#{shopcd}")
    int findByMallCategoryTotalPage(@Param("shopcd") String shopcd);




    @Select("SELECT ATTRCD, ATTRNM, FLAGDEFT, LOTTECD, NAVERCD, DOSINCD, TMONCD, KAKAOCD, MELCHICD FROM PRODATTR LIMIT 1000 OFFSET #{page} ")
    List<ProdAttrInf.ResponseProdAttrInf> findByProdAttr(@Param("page") int page);

    @Select("SELECT count(*) FROM PRODATTR")
    int findByProdAttrTotalPage();

    @Select("SELECT ATTRCD, COLSEQ, ATTRNM, FUNNSEQ, WTRADINGSEQ, TOBIZONSEQ, DOMEGGOOKSEQ, OWNERCLANSEQ, HUBSELLSEQ, DOSINSEQ, NOTICETYPE, ITEMCODE, INTERCODE, INTERAPICODE, INTERAPITYPE FROM PRODATTRNM LIMIT 1000 OFFSET #{page} ")
    List<ProdAttrInf.ResponseProdAttrNMInf> findByProdAttrNM(@Param("page") int page);

    @Select("SELECT count(*) FROM PRODATTR")
    int findByProdAttrNMTotalPage();

    @Select("SELECT SHOPCD, GOSICODE, GOSINUM, GOSIVAL FROM SHOPATTRINFO LIMIT 1000 OFFSET #{page} ")
    List<ProdAttrInf.ResponseShopAttrInfoInf> findByShopAttrInfo(@Param("page") int page);

    @Select("SELECT count(*) FROM SHOPATTRINFO")
    int findByShopAttrInfoTotalPage();




    @Select("SELECT ID, NAME, PARENT_CODE, FULL_NAME, LEVEL, SHOPCATE, DOMECATG " +
            "  FROM CATEGORY " +
            " WHERE ID = (SELECT max(ID) FROM CATEGORY_OLD WHERE OLD_ID = #{esCid} )")
    CategoryInf.ResponseCateMapInf findByCategoryOld(@Param("esCid") String esCid);

}
