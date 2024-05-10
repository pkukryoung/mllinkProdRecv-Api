package kdjsystem.mllink.dto.category;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryInf {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseCategoryMapList {
        private String code;
        private String current_page;
        private String message;
        private String total_count;
        private String total_page;
        private List<ResponseCateMapInf> categoryMapList = new ArrayList<>();
    }

    @Data
    public static class ResponseCateMapInf {
        private String id;
        private String name;
        private String parent_code;
        private String full_name;
        private String level;
        private String shopcate;
        private String domecatg;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ResponseMallCategoryList {
        private String code;
        private String current_page;
        private String message;
        private String total_count;
        private String total_page;
        private List<ResponseMallCategory> mallCategoryList = new ArrayList<>();
    }
    @Data
    public static class ResponseMallCategory {
        private String shopcd;
        private String code;
        private String shopcatenm;
        private String esmcode;
        private String esmshopcatenm;
    }

    @Getter
    @AllArgsConstructor
    public static class Response {
        private int    returnCode;
        private String returnMessage;
    }
}
