springboot-dashboard
===============

springboot base IoT dashboard application.

### Docker イメージ作成
- Dockerイメージを生成しローカルレジストリへ登録  
  Springboot 2.3 より dockerイメージが作成できるようになっており(Build Docker images with Cloud Native Buildpacks)、ここでは、当機能を用いた docker image の作成例を示す。   

  <br>

  Maven（またはGradleで）Cloud Native Buildpacksを使用してOCIイメージを作成する。
  ```
  # docker イメージ作成
  $ mvn spring-boot:build-image -Dmaven.test.skip=true
  
  # 作成したイメージを docker run で起動
  $ docker run -it -p 8080:8080 trydiy/iot-dashboard
  ```

- jib による docker イメージ作成の例（こちらは参考情報として）
  ```
  # オプション jib:dockerBuild を加えると、docker image が生成される
  $ mvn compile -P production jib:dockerBuild -Djib.to.image=registoryhost:5000/iot-dashboard
  $ docker push registoryhost:5000/iot-dashboard
  ```
