package com.orleave.dto.response;

import java.util.List;

import com.orleave.dto.BanListDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("BanListResponse")
public class BanListResponseDto extends BaseResponseDto {
	
	@ApiModelProperty(name="Ban List")
	List<BanListDto> banList;
	
	public static BanListResponseDto of(Integer statusCode, String message, List<BanListDto> banList) {
		BanListResponseDto res = new BanListResponseDto(statusCode, message, banList);
		return res;
	}

	public BanListResponseDto(Integer statusCode, String message, List<BanListDto> banList) {
		super(statusCode, message);
		this.banList = banList;
	}
}
