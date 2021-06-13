-- users(testuser1=testpass1, testUser2=testpass2, testuser3=testpass3, admin*=admin@123)
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('testuser1', '00000001','12345678', '$2a$04$3/qNOIPJA0PjOAOB4OcQ9OfsUii3O9o.N1EOPOemVAoKu9f9ado22', true, current_timestamp, null);
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('testuser2', '00000002','12345678', '$2a$04$w/lM8q7P.lDl9Kfs5i8szOEwLJHiHrpj7ea8N7pueWehqwAoxfTV.', true, current_timestamp, null);
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('testuser3', '00000003','12345678', '$2a$04$AQ8Y4M5kLRS2hGSp7F7S3uGbIY/07nFHegdwP.sgsUBaWZ56do6SC', true, current_timestamp, null);
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('admin1', '12345678','12345678', '$2a$10$uupGp0K/t2sthtY/ooUhzeIA4eRR4IJpUrmHhaPDbzh1WwWjWNfVm', true, current_timestamp, null);
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('admin2', '12345678','12345678', '$2a$10$uupGp0K/t2sthtY/ooUhzeIA4eRR4IJpUrmHhaPDbzh1WwWjWNfVm', true, current_timestamp, null);
INSERT INTO users(username, user_id, app_id, password, enabled, create_time, update_time) VALUES ('admin3', '12345678','12345678', '$2a$10$uupGp0K/t2sthtY/ooUhzeIA4eRR4IJpUrmHhaPDbzh1WwWjWNfVm', true, current_timestamp, null);

-- authorities
INSERT INTO authorities(username, authority) VALUES ('testuser1', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('testuser2', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('testuser3', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('admin1', 'ROLE_ADMIN');
INSERT INTO authorities(username, authority) VALUES ('admin2', 'ROLE_ADMIN');
INSERT INTO authorities(username, authority) VALUES ('admin3', 'ROLE_ADMIN');

