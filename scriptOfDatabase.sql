CREATE TABLE `customers` (
  `person_id` int NOT NULL,
  `wallet_id` int DEFAULT NULL,
  `rented_house_id` int DEFAULT NULL,
  `is_blocked` tinyint NOT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `advertisements` (
  `id` int NOT NULL AUTO_INCREMENT,
  `person_id` int NOT NULL,
  `house_id` int NOT NULL,
  `advertisement_name` varchar(45) NOT NULL,
  `advertisement_type` varchar(45) NOT NULL,
  `activation_personnel_id` int NOT NULL,
  `activation_result` tinyint NOT NULL,
  `calendar` date NOT NULL,
  `price` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_house_id` (`house_id`),
  CONSTRAINT `fk_house_id` FOREIGN KEY (`house_id`) REFERENCES `houses` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `comments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `advertisement_id` int NOT NULL,
  `comment` varchar(250) NOT NULL,
  `rating` int NOT NULL,
  `person_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `blocked_persons` (
  `id` int NOT NULL AUTO_INCREMENT,
  `person_id` int NOT NULL,
  `reason` varchar(45) NOT NULL,
  `block_time` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `house_images` (
  `id` int NOT NULL AUTO_INCREMENT,
  `house_id` int NOT NULL,
  `image_path` text NOT NULL,
  `image_file` longblob NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `houses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `person_id` varchar(45) NOT NULL,
  `room_number` varchar(45) NOT NULL,
  `has_vehicle_park` tinyint NOT NULL,
  `heating` varchar(45) NOT NULL,
  `address` varchar(90) NOT NULL,
  `short_description` varchar(210) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `house_owners` (
  `person_id` int NOT NULL,
  `wallet_id` int DEFAULT NULL,
  `rented_house_id` int DEFAULT NULL,
  `is_blocked` tinyint NOT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `personnels` (
  `person_id` int NOT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `wallets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `total_amount` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `persons` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `identity_number` varchar(45) NOT NULL,
  `birth_date` varchar(45) NOT NULL,
  `activation_personnel_id` int DEFAULT NULL,
  `activation_result` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `identity_number` (`identity_number`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
