package kdjsystem.mllink.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface OrderMapper {

    @Select("SELECT COUNT(*) FROM SHOPORDMST WHERE USERID = #{userid} AND ORDSEQ = #{ordseq} AND COMPNO = #{compno}")
    int existcheck(@Param("userid") String userid, @Param("ordseq") String ordseq, @Param("compno") String compno);

    @Insert("INSERT INTO SHOPORDMST (" +
            "USERID ," +
            "ORDSEQ ," +
            "COMPNO ," +
            "REG_DATE ," +
            "ORDER_ID ," +
            "SHOPID ," +
            "SHOPSEQ ," +
            "SHOP_USERID ," +
            "ORDER_STATUS ," +
            "USER_ID ," +
            "USER_NAME ," +
            "USER_TEL ," +
            "USER_CEL ," +
            "USER_EMAIL ," +
            "RECEIVE_TEL ," +
            "RECEIVE_CEL ," +
            "RECEIVE_EMAIL ," +
            "DELV_MSG ," +
            "RECEIVE_NAME ," +
            "RECEIVE_ZIPCODE ," +
            "RECEIVE_ADDR ," +
            "TOTAL_COST ," +
            "PAY_COST ," +
            "ORDER_DATE ," +
            "PARTNER_ID ," +
            "DPARTNER_ID ," +
            "MALL_PRODUCT_ID ," +
            "PRODUCT_ID ," +
            "SKU_ID ," +
            "P_PRODUCT_NAME ," +
            "P_SKU_VALUE ," +
            "PRODUCT_NAME ," +
            "SALE_COST ," +
            "MALL_WON_COST ," +
            "WON_COST ," +
            "SKU_VALUE ," +
            "SALE_CNT ," +
            "DELIVERY_METHOD_STR ," +
            "DELV_COST ," +
            "COMPAYNY_GOODS_CD ," +
            "SKU_ALIAS ," +
            "BOX_EA ," +
            "JUNG_CHK_YN ," +
            "MALL_ORDER_SEQ ," +
            "MALL_ORDER_ID ," +
            "ETC_FIELD3 ," +
            "ORDER_GUBUN ," +
            "P_EA ," +
            "ORD_FIELD2 ," +
            "COPY_IDX ," +
            "GOODS_NM_PR ," +
            "GOODS_KEYWORD ," +
            "ORD_CONFIRM_DATE ," +
            "RTN_DT ," +
            "CHNG_DT ," +
            "DELIVERY_CONFIRM_DATE ," +
            "CANCEL_DT ," +
            "CLASS_CD1 ," +
            "CLASS_CD2 ," +
            "CLASS_CD3 ," +
            "CLASS_CD4 ," +
            "BRAND_NM ," +
            "DELIVERY_ID ," +
            "INVOICE_NO ," +
            "HOPE_DELV_DATE ," +
            "FLD_DSP ," +
            "INV_SEND_MSG ," +
            "MODEL_NO ," +
            "SET_GUBUN ," +
            "ETC_MSG ," +
            "DELV_MSG1 ," +
            "MUL_DELV_MSG ," +
            "BARCODE ," +
            "INV_SEND_DM ," +
            "DELIVERY_METHOD_STR2 ," +
            "LABEL ," +
            "ORDER_ETC_1 ," +
            "ORDER_ETC_2 ," +
            "ORDER_ETC_3 ," +
            "ORDER_ETC_4 ," +
            "ORDER_ETC_5 ," +
            "ORDER_ETC_6 ," +
            "ORDER_ETC_7 ," +
            "ORDER_ETC_8 ," +
            "ORDER_ETC_9 ," +
            "ORDER_ETC_10 ," +
            "ORDER_ETC_11 ," +
            "ORDER_ETC_12 ," +
            "ORDER_ETC_13 ," +
            "ORDER_ETC_14 ," +
            "MALL_EXP_CD ," +
            "RECEIPTID ," +
            "EXCHANGEID," +
            "AUTHKEY1" +
            ") VALUES (" +
            "'${dto.userid}', '${dto.ordseq}', '${dto.compno}','${dto.reg_date}','${dto.order_id}','${dto.shopid}','${dto.shopseq}','${dto.shop_userid}','${dto.order_status}','${dto.user_id}'," +
            "'${dto.user_name}','${dto.user_tel}','${dto.user_cel}','${dto.user_email}','${dto.receive_tel}','${dto.receive_cel}','${dto.receive_email}','${dto.delv_msg}','${dto.receive_name}','${dto.receive_zipcode}','${dto.receive_addr}'," +
            "'${dto.total_cost}','${dto.pay_cost}','${dto.order_date}','${dto.partner_id}','${dto.dpartner_id}','${dto.mall_product_id}','${dto.product_id}','${dto.sku_id}'," +
            "'${dto.p_product_name}','${dto.p_sku_value}','${dto.product_name}','${dto.sale_cost}','${dto.mall_won_cost}','${dto.won_cost}','${dto.sku_value}'," +
            "'${dto.sale_cnt}','${dto.delivery_method_str}','${dto.delv_cost}','${dto.compayny_goods_cd}','${dto.sku_alias}','${dto.box_ea}','${dto.jung_chk_yn}'," +
            "'${dto.mall_order_seq}','${dto.mall_order_id}','${dto.etc_field3}','${dto.order_gubun}','${dto.p_ea}','${dto.ord_field2}','${dto.copy_idx}','${dto.goods_nm_pr}'," +
            "'${dto.goods_keyword}','${dto.ord_confirm_date}','${dto.rtn_dt}','${dto.chng_dt}','${dto.delivery_confirm_date}','${dto.cancel_dt}','${dto.class_cd1}'," +
            "'${dto.class_cd2}','${dto.class_cd3}','${dto.class_cd4}','${dto.brand_nm}','${dto.delivery_id}','${dto.invoice_no}','${dto.hope_delv_date}','${dto.fld_dsp}'," +
            "'${dto.inv_send_msg}','${dto.model_no}','${dto.set_gubun}','${dto.etc_msg}','${dto.delv_msg1}','${dto.mul_delv_msg}','${dto.barcode}','${dto.inv_send_dm}','${dto.delivery_method_str2}','${dto.label}'," +
            "'N','${dto.order_etc_2}','${dto.order_etc_3}','${dto.order_etc_4}','${dto.order_etc_5}','${dto.order_etc_6}','${dto.order_etc_7}','${dto.order_etc_8}','${dto.order_etc_9}'," +
            "'${dto.order_etc_10}','${dto.order_etc_11}','${dto.order_etc_12}','${dto.order_etc_13}','${dto.order_etc_14}','${dto.mall_exp_cd}','${dto.receiptid}','${dto.exchangeid}'," +
            "'${dto.authkey1}')"
    )
    void insertData(@Param("dto") kdjsystem.mllink.dto.order.ShopOrderMstDto dto);

    @Update("UPDATE SHOPORDMST SET ORDER_STATUS = '${dto.order_status}' WHERE USERID = '${dto.userid}' AND ORDSEQ = '${dto.ordseq}'")
    void updateData(@Param("dto") kdjsystem.mllink.dto.order.ShopOrderMstDto dto);

}