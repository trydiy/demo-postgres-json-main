OpenWeatherMap 
==========
##### 公式Webサイト [OpenWeatherMap](https://openweathermap.org/)
- APIキーの取得  
  API Keyを取得するにはアカウントを作る必要があります。  
  Sign Upページで必要な項目を入力して「Create Account」を行ってください。  


==========
##### 環境の準備

- PostgreSQL データベース上に適当なスキーマ、データベースを作成する。  
  以下例：データベース・ユーザの作成（ユーザ＝iot を作成）
   
  ```
  # su - postgres
  
  $ psql -U postgres
  ユーザー postgres のパスワード: ********
  psql (12.2)
  "help" でヘルプを表示します。

  postgres=# CREATE ROLE iot WITH LOGIN PASSWORD '********';
  CREATE ROLE
  postgres=# CREATE DATABASE iot OWNER iot encoding 'UTF8';
  CREATE DATABASE
  ```   
- スキーマの作成
  ```
  $ psql -U postgres
  ユーザー postgres のパスワード: ******** 
  psql (12.2)
  "help" でヘルプを表示します。

  postgres=# \c iot
  データベース "iot" にユーザ "postgres" として接続しました。
  iot=# create schema iot authorization iot;
  CREATE SCHEMA
  ```

- 作成したスキーマで、以下の DDL 文を実行する。
  ```
  resources/schema.sql
  resources/data.sql
  ```

- 天気情報の取得  
  現在の気象データを地点（郵便番号）を指定して取得する。  
  [API Document](https://openweathermap.org/current)

- application setting の変更箇所  
  取得したAPIキーと観測地点となるzipコードを指定する。
  ```
  appid=********************************
  zip=760-0052,JP
  ```
