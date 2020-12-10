-- users(testpass1, testpass2, testpass3)
INSERT INTO users(username, user_id, password, enabled, create_time, update_time) VALUES ('testuser1', '031468', '$2a$04$3/qNOIPJA0PjOAOB4OcQ9OfsUii3O9o.N1EOPOemVAoKu9f9ado22', true, current_timestamp, null);
INSERT INTO users(username, user_id, password, enabled, create_time, update_time) VALUES ('testuser2', '031468', '$2a$04$w/lM8q7P.lDl9Kfs5i8szOEwLJHiHrpj7ea8N7pueWehqwAoxfTV.', true, current_timestamp, null);
INSERT INTO users(username, user_id, password, enabled, create_time, update_time) VALUES ('testuser3', '031468', '$2a$04$AQ8Y4M5kLRS2hGSp7F7S3uGbIY/07nFHegdwP.sgsUBaWZ56do6SC', true, current_timestamp, null);

-- authorities
INSERT INTO authorities(username, authority) VALUES ('testuser1', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('testuser2', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('testuser3', 'ROLE_USER');
