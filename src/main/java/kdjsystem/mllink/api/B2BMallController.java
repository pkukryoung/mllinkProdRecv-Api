package kdjsystem.mllink.api;

import kdjsystem.mllink.dto.b2bmall.ProductItemDto;
import kdjsystem.mllink.dto.b2bmall.ProductResultDto;
import kdjsystem.mllink.dto.sms.SmsInf;
import kdjsystem.mllink.dto.user.UserInf;
import kdjsystem.mllink.mapper.B2BMallMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@Validated
@RequestMapping("/api/v1/b2bmall/")
public class B2BMallController {
    final B2BMallMapper b2BMallMapper;
    public String isNullString(Object val){
        return (val ==null)?"" :val.toString();
    }

    public Integer isNullIntParse(Object val){

        try{
            return Integer.parseInt(val.toString());
        }catch (Exception ex){
            return 0;
        }
    }

    @PostMapping("find")
    public ProductResultDto find(@RequestBody @Valid Map<String, Object> parmaters)
    {
        try {
            //update
            HashMap<String, Object> in_parmaters = new HashMap<>();
            in_parmaters.put("V_DOME", isNullString(parmaters.get("V_DOME")));
            in_parmaters.put("V_SDATE", isNullString(parmaters.get("V_SDATE")));
            in_parmaters.put("V_EDATE", isNullString(parmaters.get("V_EDATE")));
            in_parmaters.put("V_CID_TYPE", isNullString(parmaters.get("V_CID_TYPE")));
            in_parmaters.put("V_ES_CODE", isNullString(parmaters.get("V_ES_CODE")));
            in_parmaters.put("V_MIN_AMOUNT", isNullIntParse(parmaters.get("V_MIN_AMOUNT")));
            in_parmaters.put("V_MAX_AMOUNT", isNullIntParse(parmaters.get("V_MAX_AMOUNT")));
            in_parmaters.put("V_DELIVERY_AMOUNT_MIN", isNullIntParse(parmaters.get("V_DELIVERY_AMOUNT_MIN")));//배송비
            in_parmaters.put("V_DELIVERY_AMOUNT_MAX", isNullIntParse(parmaters.get("V_DELIVERY_AMOUNT_MAX")));//배송비
            in_parmaters.put("V_RDELIVERY_AMOUNT_MIN", isNullIntParse(parmaters.get("V_RDELIVERY_AMOUNT_MIN")));//반품배송비
            in_parmaters.put("V_RDELIVERY_AMOUNT_MAX", isNullIntParse(parmaters.get("V_RDELIVERY_AMOUNT_MAX")));//반품배송비
            in_parmaters.put("V_IS_OVERSEAS", isNullString(parmaters.get("V_IS_OVERSEAS")));//해외직배송유무
            in_parmaters.put("V_LIST_OPTION_USE", isNullString(parmaters.get("V_LIST_OPTION_USE")));//옵션유무
            in_parmaters.put("V_VENDER_M_CODE_TYPE", isNullString(parmaters.get("V_VENDER_M_CODE_TYPE")));
            in_parmaters.put("V_VENDER_M_CODE", isNullString(parmaters.get("V_VENDER_M_CODE")));
            in_parmaters.put("V_ICODE_TYPE", isNullString(parmaters.get("V_ICODE_TYPE")));
            in_parmaters.put("V_ICODE_ARR", isNullString(parmaters.get("V_ICODE_ARR")));
            in_parmaters.put("V_Q", isNullString(parmaters.get("V_Q")));
            in_parmaters.put("V_IS_TAX", isNullString(parmaters.get("V_IS_TAX")));
            in_parmaters.put("V_IS_RETURN", isNullString(parmaters.get("V_IS_RETURN")));
            in_parmaters.put("V_IS_LIMIT", isNullString(parmaters.get("V_IS_LIMIT")));
            in_parmaters.put("V_DELIVERY_TYPE", isNullString(parmaters.get("V_DELIVERY_TYPE")));
            in_parmaters.put("V_ADULT", isNullString(parmaters.get("V_ADULT")));
            in_parmaters.put("V_STATUS", isNullString(parmaters.get("V_STATUS")));
            in_parmaters.put("V_IS_MEDICAL", isNullString(parmaters.get("V_IS_MEDICAL")));
            in_parmaters.put("V_IS_H_FOOD", isNullString(parmaters.get("V_IS_H_FOOD")));
            in_parmaters.put("V_PAGE", isNullIntParse(parmaters.get("V_PAGE")));


            int page = isNullIntParse(parmaters.get("V_PAGE"));
            int togalpage = 0;
            double totalcount = 0;
            int count = 0;
            if(page==1) {
                if(isHFoodAndMedical(isNullString(parmaters.get("V_DOME")))) {
                    totalcount = b2BMallMapper.countHFoodAndMedical(in_parmaters);
                }else{
                    totalcount = b2BMallMapper.count(in_parmaters);
                }
                count = (int) totalcount;
                togalpage = (int) Math.ceil((totalcount)/1000);

            }
            List<ProductItemDto>  items;
            if(isHFoodAndMedical(isNullString(parmaters.get("V_DOME")))){
                items = b2BMallMapper.findHFoodAndMedical(in_parmaters);
            }else{
                items = b2BMallMapper.find(in_parmaters);
            }
            if(items==null ||  items.size() == 0){
                items = new ArrayList<>();
                items.add(new ProductItemDto());
                return   ProductResultDto.builder()
                        .total_count("0")
                        .total_page("0")
                        .current_page(isNullString(in_parmaters.get("V_PAGE")))
                        .message("0")
                        .items(items)
                        .build();
            }else {
                return   ProductResultDto.builder()
                        .total_count(isNullString(count))
                        .total_page(isNullString(togalpage))
                        .current_page(isNullString(in_parmaters.get("V_PAGE")))
                        .message("1")
                        .items(items)
                        .build();
            }

        }catch (Exception ex){
            return   ProductResultDto.builder()
                    .message(ex.getMessage()).build();

        }
    }

    public boolean isHFoodAndMedical(String dome) {
        Set<String> domeSet = new HashSet<>();
        domeSet.add("SHOPPRODINFO_OWNERCLAN");
        return domeSet.contains(dome.toUpperCase());
    }

    @PostMapping("updatefind")
    public ProductResultDto updatefind(@RequestBody @Valid Map<String, Object> parmaters) {
        try {
            //update
            HashMap<String, Object> in_parmaters = new HashMap<>();
            in_parmaters.put("V_DOME", isNullString(parmaters.get("V_DOME")));
            in_parmaters.put("V_SDATE", isNullString(parmaters.get("V_SDATE")));
            in_parmaters.put("V_EDATE", isNullString(parmaters.get("V_EDATE")));
            in_parmaters.put("V_PAGE", isNullIntParse(parmaters.get("V_PAGE")));


            int page = isNullIntParse(parmaters.get("V_PAGE"));
            int togalpage = 0;
            double totalcount = 0;
            int count = 0;
            if (page == 1) {
                totalcount = b2BMallMapper.updatecount(in_parmaters);
                count = (int) totalcount;
                togalpage = (int) Math.ceil((totalcount) / 1000);

            }

            List<ProductItemDto> items = new ArrayList<>();
            if(isHFoodAndMedical(isNullString(parmaters.get("V_DOME")))) {
                items = b2BMallMapper.updatefindHFoodAndMedical(in_parmaters);
            }else{
                items = b2BMallMapper.updatefind(in_parmaters);
            }
//            List<ProductItemDto> items = b2BMallMapper.updatefind(in_parmaters);

            if (items == null || items.size() == 0) {
                items = new ArrayList<>();
                items.add(new ProductItemDto());
                return ProductResultDto.builder()
                        .total_count("0")
                        .total_page("0")
                        .current_page(isNullString(in_parmaters.get("V_PAGE")))
                        .message("0")
                        .items(items)
                        .build();
            } else {
                return ProductResultDto.builder()
                        .total_count(isNullString(count))
                        .total_page(isNullString(togalpage))
                        .current_page(isNullString(in_parmaters.get("V_PAGE")))
                        .message("1")
                        .items(items)
                        .build();
            }
        } catch (Exception ex) {
            return ProductResultDto.builder()
                    .message(ex.getMessage()).build();

        }
    }

}
