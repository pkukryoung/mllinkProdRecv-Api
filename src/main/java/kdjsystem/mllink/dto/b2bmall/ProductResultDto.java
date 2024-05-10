package kdjsystem.mllink.dto.b2bmall;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductResultDto {
    public String code;
    public String current_page;
    public String message;
    public String total_count;
    public String total_page;
    public String mb_point;
    public List<ProductItemDto> items;
    public boolean hasNext;
}
