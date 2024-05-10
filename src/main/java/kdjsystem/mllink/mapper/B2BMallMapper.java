package kdjsystem.mllink.mapper;

import kdjsystem.mllink.dto.b2bmall.ProductItemDto;
import kdjsystem.mllink.dto.b2bmall.ProductResultDto;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;
import java.util.Map;

@Mapper
public interface B2BMallMapper {

    @Select("{ call YWAPI_PRODUCTS_COUNT ( " +
            "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_CID_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ES_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_MIN_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_MAX_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_IS_OVERSEAS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_LIST_OPTION_USE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_ARR, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_Q, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_TAX, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_RETURN, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_LIMIT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_DELIVERY_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ADULT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_STATUS, mode=IN, jdbcType=VARCHAR, javaType=String }) }"
    )
    @Options(statementType = StatementType.CALLABLE)
    Integer count(Map<String, Object> parameters);

    @Select("{ call YWAPI_PRODUCTS_COUNT_HFOODANDMEDICAL( " +
            "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_CID_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ES_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_MIN_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_MAX_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_IS_OVERSEAS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_LIST_OPTION_USE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_ARR, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_Q, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_TAX, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_RETURN, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_LIMIT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_DELIVERY_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ADULT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_STATUS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_MEDICAL, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_H_FOOD, mode=IN, jdbcType=VARCHAR, javaType=String }) }"
    )
    @Options(statementType = StatementType.CALLABLE)
    Integer countHFoodAndMedical(Map<String, Object> parameters);

    @Select(" select * from YWAPI_PRODUCTS_LIST ( " +
                    "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_CID_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_ES_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_MIN_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_MAX_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_DELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_DELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_RDELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_RDELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
                    "#{V_IS_OVERSEAS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_LIST_OPTION_USE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_VENDER_M_CODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_VENDER_M_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_ICODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_ICODE_ARR, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_Q, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_IS_TAX, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_IS_RETURN, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_IS_LIMIT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_DELIVERY_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_ADULT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_STATUS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_PAGE, mode=IN, jdbcType=NUMERIC, javaType=Integer })")
//    @Results({
//            @Result(property = "user_id", column = "id"),
//            @Result(property = "firstName", column = "first_name"),
//
//    })
    @Options(statementType = StatementType.CALLABLE)
    List<ProductItemDto> find(Map<String, Object> parameters);

    @Select(" select * from YWAPI_PRODUCTS_LIST_HFOODANDMEDICAL ( " +
            "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_CID_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ES_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_MIN_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_MAX_AMOUNT, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_DELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MIN, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_RDELIVERY_AMOUNT_MAX, mode=IN, jdbcType=NUMERIC, javaType=Integer },  \n" +
            "#{V_IS_OVERSEAS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_LIST_OPTION_USE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_VENDER_M_CODE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ICODE_ARR, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_Q, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_TAX, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_RETURN, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_LIMIT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_DELIVERY_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_ADULT, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_STATUS, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_MEDICAL, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_IS_H_FOOD, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_PAGE, mode=IN, jdbcType=NUMERIC, javaType=Integer })")
//    @Results({
//            @Result(property = "user_id", column = "id"),
//            @Result(property = "firstName", column = "first_name"),
//
//    })
    @Options(statementType = StatementType.CALLABLE)
    List<ProductItemDto> findHFoodAndMedical(Map<String, Object> parameters);

    @Select("select * from YWAPI_PRODUCTS_UPLIST ( " +
                    "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String }, \n" +
                    "#{V_PAGE, mode=IN, jdbcType=NUMERIC, javaType=Integer })"
    )
    @Options(statementType = StatementType.CALLABLE)
    List<ProductItemDto> updatefind(Map<String, Object> parameters);

    @Select("select * from YWAPI_PRODUCTS_UPLIST_HFOODANDMEDICAL ( " +
            "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
            "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String }, \n" +
            "#{V_PAGE, mode=IN, jdbcType=NUMERIC, javaType=Integer })"
    )
    @Options(statementType = StatementType.CALLABLE)
    List<ProductItemDto> updatefindHFoodAndMedical(Map<String, Object> parameters);

    @Select("{ CALL YWAPI_PRODUCTS_UPCOUNT ( " +
                    "#{V_DOME, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_SDATE, mode=IN, jdbcType=VARCHAR, javaType=String },  \n" +
                    "#{V_EDATE, mode=IN, jdbcType=VARCHAR, javaType=String }) }"
    )
    @Options(statementType = StatementType.CALLABLE)
    Integer updatecount(Map<String, Object> parameters);
}
