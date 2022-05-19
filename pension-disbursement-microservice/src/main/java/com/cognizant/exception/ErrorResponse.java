package com.cognizant.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

	private String message;
	private int statusCode;
	private Long exceptionTime;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Long getExceptionTime() {
		return exceptionTime;
	}

	public void setExceptionTime(Long exceptionTime) {
		this.exceptionTime = exceptionTime;
	}

}
