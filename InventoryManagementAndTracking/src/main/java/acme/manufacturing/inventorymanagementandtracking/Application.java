package acme.manufacturing.inventorymanagementandtracking;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private StreamBridge streamBridge;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}


	@Bean
	public Consumer<InventoryLevelChanged> acmeManufacturingScInventoryLevelChangedV1ErpProductIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

	public void sendAcmeManufacturingScInventoryLevelChangedV1ErpProductId(
		InventoryLevelChanged payload, String productId
		) {
		String topic = String.format("acmeManufacturing/sc/inventory/level/changed/v1/erp/%s",
			productId);
		streamBridge.send(topic, payload);
	}
}
