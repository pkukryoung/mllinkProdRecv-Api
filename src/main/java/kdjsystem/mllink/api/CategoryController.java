package kdjsystem.mllink.api;

import kdjsystem.mllink.dto.ProdAttr.ProdAttrInf;
import kdjsystem.mllink.dto.category.CategoryInf;
import kdjsystem.mllink.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@Validated
@RequestMapping("/api/v1/")
public class CategoryController {

    private  final CategoryMapper categoryMapper;

    @GetMapping("getCategoryMap")
    public CategoryInf.ResponseCateMapInf CategorySelect(@RequestParam String esCid) {
        CategoryInf.ResponseCateMapInf category = categoryMapper.findByCategory(esCid);
        if(category==null){
            category = categoryMapper.findByCategoryOld(esCid);
            if(category==null){
                category = new CategoryInf.ResponseCateMapInf();
            }
        }
        return category;
    }

    @PostMapping("updateCategoryMap")
    public CategoryInf.Response CategoryUpdate(@RequestBody @Valid CategoryInf.ResponseCateMapInf categoryinf) {

        int Suss = 0;
        Suss = categoryMapper.updateCategory(categoryinf.getId(),categoryinf.getDomecatg(),categoryinf.getShopcate());

        if (Suss == 0) {
            return new CategoryInf.Response(-1,"업데이트중 오류가 발생하였습니다.");
        } else {
            return new CategoryInf.Response(1,"정상처리" );
        }
    }

    @GetMapping("searchCategoryMap")
    public CategoryInf.ResponseCategoryMapList CategoryMapSearch(@RequestParam String page) {

        int startPage =  (Integer.parseInt(page) * 1000) == 0 ? 0 : (Integer.parseInt(page) * 1000) + 1;
        List<CategoryInf.ResponseCateMapInf> categoryMapList = categoryMapper.findByCategoryMap(startPage);
        int totalpage = 0;
        int totalcount = 0;
        if(page.equals("0")) {
            totalcount = categoryMapper.findByCategoryMapTotalPage();
            totalpage = (int) Math.ceil(totalcount/1000);
        }

        return  CategoryInf.ResponseCategoryMapList.builder()
                .current_page(page)
                .total_count(Integer.toString(totalcount))
                .total_page(Integer.toString(totalpage))
                .categoryMapList(categoryMapList)
                .build();

    }

    @GetMapping("searchMallCategory")
    public CategoryInf.ResponseMallCategoryList MallCategorySearch(@RequestParam String shopcd, String page) {

        int startPage =  (Integer.parseInt(page) * 1000) == 0 ? 0 : (Integer.parseInt(page) * 1000);
        List<CategoryInf.ResponseMallCategory> mallCategoryList = categoryMapper.findByMallCategory(shopcd, startPage);
        int totalpage = 0;
        int totalcount = 0;
        if(page.equals("0")) {
            totalcount = categoryMapper.findByMallCategoryTotalPage(shopcd);
            totalpage = (int) Math.ceil(totalcount/1000);
        }

        return  CategoryInf.ResponseMallCategoryList.builder()
                .current_page(page)
                .total_count(Integer.toString(totalcount))
                .total_page(Integer.toString(totalpage))
                .mallCategoryList(mallCategoryList)
                .build();
    }

    @GetMapping("searchProdAttr")
    public ProdAttrInf.ResponseProdAttrList ProdAttrSearch(@RequestParam String page) {

        int startPage =  (Integer.parseInt(page) * 1000) == 0 ? 0 : (Integer.parseInt(page) * 1000) + 1;
        List<ProdAttrInf.ResponseProdAttrInf> prodAttrList = categoryMapper.findByProdAttr(startPage);
        int totalpage = 0;
        int totalcount = 0;
        if(page.equals("0")) {
            totalcount = categoryMapper.findByProdAttrTotalPage();
            totalpage = (int) Math.ceil(totalcount/1000);
        }

        return ProdAttrInf.ResponseProdAttrList.builder()
                .current_page(page)
                .total_count(Integer.toString(totalcount))
                .total_page(Integer.toString(totalpage))
                .prodAttrList(prodAttrList)
                .build();

    }

    @GetMapping("searchProdAttrNM")
    public ProdAttrInf.ResponseProdAttrNMList ProdAttrNMSearch(@RequestParam String page) {

        int startPage =  (Integer.parseInt(page) * 1000) == 0 ? 0 : (Integer.parseInt(page) * 1000) + 1;
        List<ProdAttrInf.ResponseProdAttrNMInf> prodAttrNMList = categoryMapper.findByProdAttrNM(startPage);
        int totalpage = 0;
        int totalcount = 0;
        if(page.equals("0")) {
            totalcount = categoryMapper.findByProdAttrNMTotalPage();
            totalpage = (int) Math.ceil(totalcount/1000);
        }

        return ProdAttrInf.ResponseProdAttrNMList.builder()
                .current_page(page)
                .total_count(Integer.toString(totalcount))
                .total_page(Integer.toString(totalpage))
                .prodAttrNMList(prodAttrNMList)
                .build();

    }

    @GetMapping("searchgetShopAttrInfo")
    public ProdAttrInf.ResponseShopAttrInfoList getShopAttrInfoSearch(@RequestParam String page) {

        int startPage =  (Integer.parseInt(page) * 1000) == 0 ? 0 : (Integer.parseInt(page) * 1000) + 1;
        List<ProdAttrInf.ResponseShopAttrInfoInf> shopAttrInfoList = categoryMapper.findByShopAttrInfo(startPage);
        int totalpage = 0;
        int totalcount = 0;
        if(page.equals("0")) {
            totalcount = categoryMapper.findByShopAttrInfoTotalPage();
            totalpage = (int) Math.ceil(totalcount/1000);
        }

        return ProdAttrInf.ResponseShopAttrInfoList.builder()
                .current_page(page)
                .total_count(Integer.toString(totalcount))
                .total_page(Integer.toString(totalpage))
                .shopAttrInfoInf(shopAttrInfoList)
                .build();

    }

}
