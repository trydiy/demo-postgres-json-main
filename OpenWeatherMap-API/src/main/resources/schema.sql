DROP TABLE IF EXISTS open_weather_map;
DROP TABLE IF EXISTS weather_icons;

-- CREATE open_weather_map
CREATE TABLE open_weather_map (
  zipcode                 VARCHAR(20) NOT NULL,
  dt_time                 TIMESTAMP NOT NULL,
  lon                     DOUBLE PRECISION,
  lat                     DOUBLE PRECISION,
  weather_id              INTEGER,
  weather_main            VARCHAR(128),
  description             VARCHAR(128),
  weather_icon            VARCHAR(128),
  base                    VARCHAR(128),
  temp                    DOUBLE PRECISION,
  feel_like               DOUBLE PRECISION,
  temp_min                DOUBLE PRECISION,
  temp_max                DOUBLE PRECISION,
  pressure                DOUBLE PRECISION,
  humidity                DOUBLE PRECISION,
  visibility              INTEGER,
  wind_speed              DOUBLE PRECISION,
  wind_direction          DOUBLE PRECISION,
  wind_gust               DOUBLE PRECISION,
  cloud_all               DOUBLE PRECISION,
  type                    INTEGER,
  id                      INTEGER,
  county                  VARCHAR(30),
  sunrise_time            TIMESTAMP,
  sunset_time             TIMESTAMP,
  timezone                INTEGER,
  city_id                 INTEGER,
  location_name           VARCHAR(128),
  status_code             INTEGER,
  create_time             TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  update_time             TIMESTAMP,
CONSTRAINT PK_OPEN_WEATHER_MAP primary key (
    zipcode, dt_time
));

-- CREATE weather_icons
CREATE TABLE weather_icons (
  id                   VARCHAR(10)  NOT NULL,
  main                 VARCHAR(128) NOT NULL,
  description          VARCHAR(128) NOT NULL,
  icon                 VARCHAR(10) NOT NULL,
CONSTRAINT PK_WEATHER_ICONS primary key (
  id
));

