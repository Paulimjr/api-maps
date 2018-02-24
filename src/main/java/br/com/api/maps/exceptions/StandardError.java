package br.com.api.maps.exceptions;

import java.io.Serializable;
		
public class StandardError implements Serializable {
	
	private static final long serialVersionUID = -5L;
	
	private Integer status;
	private String message;
	private String date;
	
	public StandardError(Integer status, String message, String date) {
		super();
		this.status = status;
		this.message = message;
		this.date = date;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return message;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.message = msg;
	}

	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return date;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.date = dateTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StandardError [status=" + status + ", message=" + message + ", date=" + date + "]";
	}
	
}
