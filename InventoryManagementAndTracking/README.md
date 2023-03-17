# Inventory Management and Tracking Event API

## Version 0.1.0

This Event API involves the ERP system to track inventory levels and trigger replenishment, and radio-frequency identification (RFID) or barcode technology to update inventory tracking in real-time.

* ERP system publishes "Inventory level changed" event when inventory levels change.
* RFID or barcode technology subscribes to "Inventory level changed" event to update inventory tracking.
* ERP system subscribes to "Inventory level changed" event to update inventory levels and trigger replenishment if necessary.
* MES system subscribes to "Inventory level changed" event to adjust production scheduling and avoid stockouts.

