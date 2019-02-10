package com.noomask.liyuan.common.dto;

public class DTOs {

	public static JsonDto getJson(String msg) {
		return getJson(true, msg, null);
	}
	
	public static JsonDto getJson(String msg, Object data) {
		return getJson(true, msg, data);
	}
	
	public static JsonDto getJson(boolean success, String msg) {
		return getJson(success, msg, null);
	}
	
	public static JsonDto getJson(boolean success, String msg, Object data) {
		JsonDto dto = new JsonDto();
		dto.setSuccess(true);
		dto.setMsg(msg);
		dto.setData(data);
		return dto;
	}
	
}
