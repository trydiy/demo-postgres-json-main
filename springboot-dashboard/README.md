springboot-dashboard
===============

springboot base IoT dashboard application.

### Docker イメージ作成
- Dockerイメージを生成しローカルレジストリへ登録  
  Spring Boot 2.3よりCloud Native Buildpacksがサポートされている。  
  MavenまたはGradleでCloud Native Buildpacksを使用してOCIイメージを作成する。
  ```
  # docker イメージ作成
  $ mvn spring-boot:build-image -Dmaven.test.skip=true
  
  # 作成したイメージをdocker runで起動
  $ docker run -d -p 8080:8080 trydiy/iot-dashboard
  ```

- jib による docker イメージ作成
  ```
  # オプション jib:dockerBuild を加えると、docker image が生成される
  $ mvn compile -P production jib:dockerBuild -Djib.to.image=registoryhost:5000/iot-dashboard
  $ docker push registoryhost:5000/iot-dashboard
  ```
