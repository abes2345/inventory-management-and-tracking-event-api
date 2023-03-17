package acme.manufacturing.inventorymanagementandtracking;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryLevelChanged {

	public InventoryLevelChanged () {
	}

	public InventoryLevelChanged (
		String eventId, 
		String productId, 
		String locationId, 
		Integer changeAmount, 
		java.time.OffsetDateTime timestamp) {
		this.eventId = eventId;
		this.productId = productId;
		this.locationId = locationId;
		this.changeAmount = changeAmount;
		this.timestamp = timestamp;
	}

	private String eventId;
	private String productId;
	private String locationId;
	private Integer changeAmount;
	private java.time.OffsetDateTime timestamp;
	public String getEventId() {
		return eventId;
	}

	public InventoryLevelChanged setEventId(String eventId) {
		this.eventId = eventId;
		return this;
	}


	public String getProductId() {
		return productId;
	}

	public InventoryLevelChanged setProductId(String productId) {
		this.productId = productId;
		return this;
	}


	public String getLocationId() {
		return locationId;
	}

	public InventoryLevelChanged setLocationId(String locationId) {
		this.locationId = locationId;
		return this;
	}


	public Integer getChangeAmount() {
		return changeAmount;
	}

	public InventoryLevelChanged setChangeAmount(Integer changeAmount) {
		this.changeAmount = changeAmount;
		return this;
	}


	public java.time.OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public InventoryLevelChanged setTimestamp(java.time.OffsetDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String toString() {
		return "InventoryLevelChanged ["
		+ " eventId: " + eventId
		+ " productId: " + productId
		+ " locationId: " + locationId
		+ " changeAmount: " + changeAmount
		+ " timestamp: " + timestamp
		+ " ]";
	}
}
