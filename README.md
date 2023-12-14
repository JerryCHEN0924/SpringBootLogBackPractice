# SpringBoot整合的logback功能

### log4j2
log4j2 是 log4j 的後繼版本，它在設計上解決了一些 log4j 存在的性能和低效率問題。
它提供了異步日誌記錄機制，可以更有效地處理大量的日誌輸出。
log4j2 也支援配置文件和程式碼方式來進行日誌的配置。
與 log4j 相比，log4j2 在性能方面有顯著的改進，且在設計上更現代化。

### slf4j
slf4j 不是一個實際的日誌實作框架，而是一個日誌的抽象層（Facade）。
它提供了一個通用的日誌介面，使得程式碼可以與特定的日誌實作（如 log4j、log4j2、java.util.logging 等）解耦，從而達到更容易切換不同的日誌實作的目的。
使用 slf4j，您的應用程式會依賴 slf4j API，而實際的日誌實作則可以在部署時進行配置。

參考資料:
https://medium.com/learning-from-jhipster/11-spring-boot-%E4%BD%BF%E7%94%A8-logback-%E6%88%96-log4j2-e655b320a2c8
