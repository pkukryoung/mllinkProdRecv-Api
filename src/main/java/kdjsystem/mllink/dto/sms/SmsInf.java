package kdjsystem.mllink.dto.sms;

import kdjsystem.mllink.dto.user.UserInf;
import lombok.*;

@Data
@AllArgsConstructor
public class SmsInf {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ResponseLoginFailException extends  IllegalArgumentException {
        private Integer resultCode;
        private String  resultText;

        @Builder
        public ResponseLoginFailException(Integer resultCode, String resultText) {
            this.resultCode = resultCode;
            this.resultText = resultText;

        }
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class RequestSmsCharge {
        private Integer compno;
        private String userid;
        private Integer serialno;
        private Integer smsprice;
        private Integer lmsprice;
        private String smsaliase;

        public RequestSmsCharge(Integer compno, String userid, Integer serialno, Integer smsprice, Integer lmsprice, String smsaliase) {
            this.compno = compno;
            this.userid = userid;
            this.serialno = serialno;
            this.smsprice = smsprice;
            this.lmsprice = lmsprice;
            this.smsaliase = smsaliase;
        }
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    public static class RequestSmsChargeUpdate {
        private String userid;
        private Integer smsuseamt;
        private Integer smsbalance;
        private  String content;
        private String smstype;
        private String tocontact;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    public static class RequestSmsChargeSelect {
        private String userid;
        private String dateFrom;
        private String dateTo;
        private String telno;
        private String content;
        private String type;
    }



    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    public static class RequestSmsChargeMst {
        private Integer compno;
        private String userid;
        private String contractno;
        private String smsno;
        private Integer smschgamt;
        private Integer smsuseamt;
        private Integer smsbalance;
        private Integer contprice;
        private Integer smsprice;
        private Integer lmsprice;
        private  String comment;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class RequestSmsChargeDtl {
        private Integer compno;
        private Integer aliaseseq;
        private String tocontact;
        private String contents;
        private String sentdate;
        private String timespent;
        private String smstype;
        private String userid;

        public RequestSmsChargeDtl(Integer compno, Integer aliaseseq, String tocontact, String contents, String sentdate, String timespent, String smstype,String userid) {
            this.compno = compno;
            this.aliaseseq = aliaseseq;
            this.tocontact = tocontact;
            this.contents = contents;
            this.sentdate = sentdate;
            this.timespent = timespent;
            this.smstype = smstype;
            this.userid = userid;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class RequestChargeDtl {
        private Integer compno;
        private Integer select;
        private String orddtFrom;
        private String orddtTo;
        private String content;
        private String userid;

        public RequestChargeDtl(Integer compno, Integer select, String orddtFrom, String orddtTo, String content, String userid) {
            this.compno = compno;
            this.select = select;
            this.orddtFrom = orddtFrom;
            this.orddtTo = orddtTo;
            this.content = content;
            this.userid = userid;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class RequestInvoice {
        private Integer compno;
        private String orddt;
        private Integer ordseq;
        private Integer seq;
        private String receive_name;
        private String dlv_id;
        private String invoice_no;
        private String senddate;

        public RequestInvoice(Integer compno, String orddt, Integer ordseq, Integer seq, String receive_name, String dlv_id, String invoice_no, String senddate) {
            this.compno = compno;
            this.orddt = orddt;
            this.ordseq = ordseq;
            this.seq = seq;
            this.receive_name = receive_name;
            this.dlv_id = dlv_id;
            this.invoice_no = invoice_no;
            this.senddate = senddate;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class RequestGetInvoice {
        private Integer compno;
        private String dateFrom;
        private String dateTo;

        public RequestGetInvoice(Integer compno, String dateFrom, String dateTo) {
            this.compno = compno;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseInvoice {
        private Integer resultCode;
        private String resultText;
        private Integer compno;
        private String orddt;
        private Integer ordseq;
        private Integer seq;
        private String receive_name;
        private String dlv_id;
        private String invoice_no;
        private String senddate;

        @Builder
        public ResponseInvoice(UserInf.ResponseUseInf userInf, Integer resultCode, String resultText ) {
            this.resultCode = resultCode;
            this.resultText = resultText;
            this.compno = compno;
            this.orddt = orddt;
            this.ordseq = ordseq;
            this.seq = seq;
            this.receive_name = receive_name;
            this.dlv_id = dlv_id;
            this.invoice_no = invoice_no;
            this.senddate = senddate;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @Builder
    public static class ResponseSmsHistory {
        private String contractno;
        private Integer seq;
        private String tocontact;
        private String contents;
        private String sentdate;
        private String timespent;
        private String smstype;
        private Integer amt;

        public ResponseSmsHistory(String contractno, Integer seq, String tocontact, String contents, String sentdate, String timespent, String smstype,Integer amt) {
            this.contractno = contractno;
            this.seq = seq;
            this.tocontact = tocontact;
            this.contents = contents;
            this.sentdate = sentdate;
            this.timespent = timespent;
            this.smstype = smstype;
            this.amt = amt;
        }
    }

}
