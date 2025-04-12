# User Management Backend (Spring Boot)

Androidアプリと連携する、ユーザー管理用のREST APIサーバです。

## Features
- ユーザーの一覧取得 (GET `/users`)
- ユーザーの新規登録 (POST `/users`)
- ユーザー情報の更新 (PUT `/users/{id}`)
- ユーザーの削除 (DELETE `/users/{id}`)

## 技術スタック
- Java 21
- Spring Boot
- MyBatis
- MySQL
- REST API


## 起動方法
1. MySQL を起動し、`user_db` を作成
2. `src/main/resources/application.properties` を自分の環境に合わせて修正
3. Spring Boot アプリを起動