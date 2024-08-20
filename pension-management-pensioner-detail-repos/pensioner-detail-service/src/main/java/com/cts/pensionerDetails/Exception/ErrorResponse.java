package com.cts.pensionerDetails.Exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class for customizing error response in exception handler
 * 
 * @author Abby
 *
 */
@Getter
@AllArgsConstructor
public class ErrorResponse {

	private String message;
	private LocalDateTime timestamp;

	/**
	 * Used only for input validation errors
	 */
	@JsonInclude(Include.NON_NULL)
	private List<String> fieldErrors;
	
	
	
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", timestamp=" + timestamp + ", fieldErrors=" + fieldErrors + "]";
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public List<String> getFieldErrors() {
		return fieldErrors;
	}
	
	
}
