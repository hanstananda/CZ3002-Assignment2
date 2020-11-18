CREATE DATABASE `cz3002`;
use `cz3002`;
CREATE TABLE `user_table` (
  `user` varchar(32) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO cz3002.user_table (user, password) VALUES ('farhan', 'bTjTCuqR1xjgH1xnvkCONgsHNx2KDN94cqXoN7E/AsDzcmTuFjkeb0K+MgaC2jdmOYG558NMupKMi4eMlSIG3Q==');
INSERT INTO cz3002.user_table (user, password) VALUES ('hans', '6difygY52BLovHuoZ4CsYKEYmnO//TcCddB/TBPcNwSxeIIph6KDYGkgKx6qk6h3ols6nNrgBWYvygDocp3wSg==');
INSERT INTO cz3002.user_table (user, password) VALUES ('marcus', 'KrCtjGR1BLiaOgnE81z5wCDxSuHjkOAsSFR9P40lFV1rus2rHU1CeXhFGbscLh9JRKUnlujSAE2Z8MwnWC0Tqg==');
INSERT INTO cz3002.user_table (user, password) VALUES ('test', '7iaw3Ur350mqGo7jwQrpkj9hiYB3Lkc/iBml1JQODbJ6wYX4oOHV+E+IvIh/1nsUNzLDBMxfqa2Ob1f1ACio/w==');