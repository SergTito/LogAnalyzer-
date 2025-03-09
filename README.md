# 🚀 Log Analytics System

**Система аналитики логов**, которая собирает, анализирует и предоставляет API для поиска логов.  
Логи передаются через Kafka/RabbitMQ, сохраняются в PostgreSQL, а метрики мониторятся в Prometheus/Grafana.  

## 🛠 Технологический стек  
- **Backend:** Spring Boot (Web, Data, Cloud Stream, Actuator)  
- **Брокеры сообщений:** Kafka / RabbitMQ  
- **База данных:** PostgreSQL  
- **Мониторинг:** Prometheus, Grafana  
- **Контейнеризация:** Docker, Kubernetes  
- **Документация API:** Swagger (SpringDoc OpenAPI)  
- **Тестирование:** JUnit, Testcontainers, WireMock  
- **Нагрузочное тестирование:** k6 / Gatling  
- **Логирование:** ELK Stack (Elasticsearch, Logstash, Kibana) (опционально)  

## 📌 Функциональность  
✅ Приём логов через Kafka/RabbitMQ  
✅ Хранение логов в PostgreSQL  
✅ Поиск и фильтрация по уровню (`INFO`, `WARN`, `ERROR`), сервису, времени  
✅ API-документация в Swagger  
✅ Мониторинг метрик в Prometheus/Grafana  
✅ Нагрузочное тестирование  

## 📦 Установка и запуск  

### 1️⃣ **Запуск через Docker Compose**  
```sh
docker-compose up -d
2️⃣ Запуск вручную
Запустить инфраструктуру (Kafka, PostgreSQL, Prometheus, Grafana)
sh
Копировать
Редактировать
docker-compose up kafka postgres prometheus grafana
Запустить Backend
sh
Копировать
Редактировать
mvn clean install  
java -jar log-analytics-service.jar
📡 API Документация
После запуска, Swagger доступен по адресу:
🔗 http://localhost:8080/swagger-ui.html

📊 Мониторинг
Grafana: http://localhost:3000
Prometheus: http://localhost:9090

🔥 Нагрузочное тестирование
Запуск тестов с k6:

sh
Копировать
Редактировать
k6 run load-test.js
👨‍💻 Контрибьютинг
Если хочешь помочь — делай fork, создавай PR, пиши issue!

Лого и скриншоты (если есть)
Если потом добавишь UI/Grafana-дашборды, можешь сюда вставить картинки.

📜 Лицензия
MIT License
