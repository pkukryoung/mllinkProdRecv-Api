package kdjsystem.mllink.mapper;

import kdjsystem.mllink.dto.sms.SmsInf;
import kdjsystem.mllink.dto.user.UserInf;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mapper
public interface SmsMapper {


//    $resultData["compno"]		= $kdFrontSeq ;
//    $resultData["userid"]		= $kdFrontID;
//    $resultData["contractno"]   = $orderNumber;
//    $resultData["chargeprice"]   = $chargePrice;
//    $resultData["smsno"]	= $kdFrontHp;
    // 주석처리
    @Insert(value = {
            "{ select YWD_CREATE_SMSCHARGMASTER ( #{V_COMPNO, mode=IN, jdbcType=NUMERIC, javaType=Integer },  #{V_USERID, mode=IN, jdbcType=VARCHAR, javaType=String },  #{V_CONTRACTNO, mode=IN, jdbcType=VARCHAR, javaType=String},#{V_CHARGEPRICE, mode=IN, jdbcType=NUMERIC, javaType=Integer },    #{V_SMSNO, mode=IN, jdbcType=VARCHAR, javaType=String} ,#{V_RESULT, mode=OUT, jdbcType=VARCHAR }   ) }"
    })
    @Options(statementType = StatementType.CALLABLE)
    void smsChargeMaster(Map<String, Object> parameters);


    @Insert(value = {
            "{ select YWD_UPDATE_SMSCHARGMASTER ( #{V_USERID, mode=IN, jdbcType=VARCHAR, javaType=String },  #{V_SMSUSEAMT, mode=IN, jdbcType=NUMERIC, javaType=Integer }, #{V_SMSBALANCE, mode=IN, jdbcType=NUMERIC, javaType=Integer } , #{V_CONTENTS, mode=IN, jdbcType=VARCHAR, javaType=String } ,#{V_SMSTYPE, mode=IN, jdbcType=VARCHAR, javaType=String },#{V_TOCONTACT, mode=IN, jdbcType=VARCHAR, javaType=String } ,#{V_RESULT, mode=OUT, jdbcType=VARCHAR })}"
    })
    @Options(statementType = StatementType.CALLABLE)
    void setSmsChargeMstUpdate(Map<String, Object> parameters);




    @Select("SELECT COMPNO, SMSALIASE, SMSNO, SMSCHGAMT, SMSUSEAMT, SMSBALANCE, CONTPRICE, SERIALNO, USERID, SMSPRICE, LMSPRICE FROM SMSCHARGEMST WHERE USERID = #{userid} ")
    Optional<SmsInf.RequestSmsCharge> findBySmsCharge(@Param("userid") String userid);

    @Insert("INSERT INTO SMSCHARGEMST ( COMPNO , USERID , SERIALNO , SMSPRICE , LMSPRICE , SMSALIASE, SMSCHGAMT, SMSUSEAMT, SMSBALANCE, CONTPRICE)   " +
            "VALUES (#{compno}, #{userid} , 0 , 20 , 53 , #{smsaliase} , 0, 0, 0, 13)")
    int setSmsChargeMst(@Param("compno") Integer compno, @Param("userid") String userid,@Param("smsaliase") String smsaliase);

//    @Update("update SMSCHARGEMST_TEST set SMSUSEAMT= #{smsuseamt}, SMSBALANCE= #{smsbalance} where CONTRACTNO =  (\n" +
//            "             SELECT coalesce(SMSCONTNO,'') FROM USERINF WHERE USERID=#{userid})")
//    int setSmsChargeMstUpdate(@Param("userid") String userid,@Param("smsuseamt") Integer smsuseamt,@Param("smsbalance") Integer smsbalance);

    @Select("SELECT  \n" +
            "    coalesce(A.COMPNO,'') AS COMPNO\n" +
            "  , coalesce(A.USERID,'') AS USERID\n" +
            "  , coalesce(B.CONTRACTNO, '') AS CONTRACTNO\n" +
            "  , coalesce(B.SMSNO, '') AS SMSNO \n" +
            "  , coalesce(B.SMSCHGAMT, 0) AS SMSCHGAMT\n" +
            "  , coalesce(B.SMSUSEAMT, 0) AS SMSUSEAMT\n" +
            "  , coalesce(B.SMSBALANCE,0) AS SMSBALANCE \n" +
            "  , coalesce(B.CONTPRICE,0) AS CONTPRICE  \n" +
            "  , coalesce(B.LMSPRICE, 0) AS LMSPRICE\n" +
            "  , coalesce(B.SMSPRICE,0) AS SMSPRICE \n" +
            "  , coalesce(B.COMMENT,'') AS COMMENT\n" +
            "FROM USERINF  AS A\n" +
            "LEFT JOIN SMSCHARGEMST AS B \n" +
            "ON A.SMSCONTNO  = B.CONTRACTNO \n" +
            "where A.USERID= #{userid} ")
    SmsInf.RequestSmsChargeMst smsSelect(@Param("userid") String userid);

    @Insert("insert into SMSCHARGEDTL (COMPNO,ALIASESEQ, TOCONTACT,CONTENTS, SENTDATE, TIMESPENT,SMSTYPE,USERID) values(#{compno}, #{aliaseseq}, #{tocontact}, #{contents}, " +
            "#{sentdate}, #{timespent}, #{smstype}, #{userid}) ")
    int setSmsChargeDtl(@Param("compno") Integer compno, @Param("aliaseseq") Integer aliaseseq,@Param("tocontact") String tocontact,@Param("contents") String contents
            ,@Param("sentdate") String sentdate,@Param("timespent") String timespent,@Param("smstype") String smstype,@Param("userid") String userid);

    @Update("update SMSCHARGEMST set SERIALNO= #{serialno} where userid = #{userid}")
    int setSmsChargeSerial(@Param("userid") String userid,@Param("serialno") Integer serialno);

    @Select("SELECT COMPNO, SMSALIASE, SMSNO, SMSCHGAMT, SMSUSEAMT, SMSBALANCE, CONTPRICE, SERIALNO, USERID, SMSPRICE, LMSPRICE FROM SMSCHARGEMST WHERE COMPNO = #{compno} AND USERID = #{userid} ")
    Optional<SmsInf.RequestSmsChargeMst> findBySmscheck(@Param("compno") Integer compno, @Param("userid") String userid);

    @Update("update SMSCHARGEMST set SMSCHGAMT= #{smschgamt}, SMSBALANCE= #{smsbalance} where COMPNO = #{compno} and userid = #{userid}")
    int setSmsPriceUpdate(@Param("compno") Integer compno, @Param("userid") String userid,@Param("smschgamt") Integer smschgamt,@Param("smsbalance") Integer smsbalance);





    @Select(value = {
            "{ select * from YWD_SELECT_SMSCHARGE_HISTORY ( #{V_USERID, mode=IN, jdbcType=VARCHAR, javaType=String },  #{V_FROM_DATE, mode=IN, jdbcType=VARCHAR, javaType=String }, #{V_TO_DATE, mode=IN, jdbcType=VARCHAR, javaType=String } , #{V_TOCONTACT, mode=IN, jdbcType=VARCHAR, javaType=String } ,#{V_CONTENTS, mode=IN, jdbcType=VARCHAR, javaType=String } ,#{V_TYPE, mode=IN, jdbcType=VARCHAR, javaType=String  })}"
    })
    @Options(statementType = StatementType.CALLABLE)
    List<SmsInf.ResponseSmsHistory> smschargeDtlAll(Map<String, Object> parameters);





    @Select("SELECT ALIASESEQ, TOCONTACT ,CONTENTS ,SENTDATE ,TIMESPENT ,smstype from SMSCHARGEDTL where USERID = #{userid} and SENTDATE >= #{orddtFrom} and SENTDATE <= #{orddtTo} and ALIASESEQ LIKE #{contents} ORDER BY SENTDATE DESC, TIMESPENT DESC")
    List<SmsInf.RequestSmsChargeDtl> smschargeDtlseq(@Param("userid") String userid, @Param("orddtFrom") String orddtFrom, @Param("orddtTo") String orddtTo, @Param("contents") String contents);

    @Select("SELECT ALIASESEQ, TOCONTACT ,CONTENTS ,SENTDATE ,TIMESPENT ,smstype from SMSCHARGEDTL where USERID = #{userid} and SENTDATE >= #{orddtFrom} and SENTDATE <= #{orddtTo} and TOCONTACT LIKE #{contents} ORDER BY SENTDATE DESC, TIMESPENT DESC")
    List<SmsInf.RequestSmsChargeDtl> smschargeDtltocontact(@Param("userid") String userid, @Param("orddtFrom") String orddtFrom, @Param("orddtTo") String orddtTo, @Param("contents") String contents);

    @Select("SELECT ALIASESEQ, TOCONTACT ,CONTENTS ,SENTDATE ,TIMESPENT ,smstype from SMSCHARGEDTL where USERID = #{userid} and SENTDATE >= #{orddtFrom} and SENTDATE <= #{orddtTo} and CONTENTS LIKE #{contents} ORDER BY SENTDATE DESC, TIMESPENT DESC")
    List<SmsInf.RequestSmsChargeDtl> smschargeDtlcontents(@Param("userid") String userid, @Param("orddtFrom") String orddtFrom, @Param("orddtTo") String orddtTo, @Param("contents") String contents);

    @Insert("INSERT INTO TRAN_SHOPORDLIST (COMPNO, ORDDT,ORDSEQ,SEQ,RECEIVE_NAME,SENDDATE,DLV_ID) VALUES (#{compno}, #{orddt},#{ordseq},#{seq},#{receive_name},#{senddate},#{dlv_id}) " +
            "ON DUPLICATE KEY UPDATE RECEIVE_NAME = #{receive_name}, SENDDATE = #{senddate}, DLV_ID = #{dlv_id} ")
    int setInvoice(@Param("compno") Integer compno, @Param("orddt") String orddt, @Param("ordseq") Integer ordseq, @Param("seq") Integer seq,
                   @Param("receive_name") String receive_name,@Param("senddate") String senddate,@Param("dlv_id") String dlv_id);

    @Select("SELECT COMPNO,ORDDT,ORDSEQ,SEQ,RECEIVE_NAME,SENDDATE,DLV_ID,INVOICE_NO FROM TRAN_SHOPORDLIST WHERE COMPNO = #{compno} AND ORDDT >=#{dateFrom} AND orddt<=#{dateTo} AND INVOICE_NO IS NOT NULL")
    List<SmsInf.RequestInvoice> findByInvoice(@Param("compno") Integer compno, @Param("dateFrom") String dateFrom, @Param("dateTo") String dateTo);

}
