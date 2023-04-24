package com.platzi.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
	private int purchaseId;
	private String clientId;
	private LocalDateTime date;
	private String paymentMethod;
	private String comment;
	private String state;
	private List<PurchaseItem> item;
	
	/**
	 * @return the purchaseId
	 */
	public int getPurchaseId() {
		return purchaseId;
	}
	/**
	 * @param purchaseId the purchaseId to set
	 */
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the item
	 */
	public List<PurchaseItem> getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(List<PurchaseItem> item) {
		this.item = item;
	} 
}
