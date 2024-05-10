package kdjsystem.mllink.dto.ProdAttr;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProdAttrInf {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseProdAttrList {
        private String code;
        private String current_page;
        private String message;
        private String total_count;
        private String total_page;
        private List<ResponseProdAttrInf> prodAttrList = new ArrayList<>();
    }

    @Data
    public static class ResponseProdAttrInf {
        private String attrcd;
        private String attrnm;
        private String flagdeft;
        private String lottecd;
        private String navercd;
        private String dosincd;
        private String tmoncd;
        private String kakaocd;
        private String melchicd;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseProdAttrNMList {
        private String code;
        private String current_page;
        private String message;
        private String total_count;
        private String total_page;
        private List<ResponseProdAttrNMInf> prodAttrNMList = new ArrayList<>();
    }
    @Data
    public static class ResponseProdAttrNMInf {
        private String attrcd;
        private String colseq;
        private String attrnm;
        private String funnseq;
        private String wtradingseq;
        private String tobizonseq;
        private String domeggookseq;
        private String ownerclanseq;
        private String hubsellseq;
        private String dosinseq;
        private String noticetype;
        private String itemcode;
        private String intercode;
        private String interapicode;
        private String interapitype;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseShopAttrInfoList {
        private String code;
        private String current_page;
        private String message;
        private String total_count;
        private String total_page;
        private List<ResponseShopAttrInfoInf> shopAttrInfoInf = new ArrayList<>();
    }
    @Data
    public static class ResponseShopAttrInfoInf {
        private String shopcd;
        private String gosicode;
        private String gosinum;
        private String gosival;

    }

    @Getter
    @AllArgsConstructor
    public static class Response {
        private int    returnCode;
        private String returnMessage;
    }
}
