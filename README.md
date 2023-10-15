# otus_2.11
Инструментировать сервис из прошлого задания метриками в формате Prometheus с помощью библиотеки для вашего фреймворка и ЯП.
Сделать дашборд в Графане, в котором были бы метрики с разбивкой по API методам:

1. Latency (response time) с квантилями по 0.5, 0.95, 0.99, max
2. RPS
3. Error Rate - количество 500ых ответов
Добавить в дашборд графики с метрикам в целом по сервису, взятые с nginx-ingress-controller:
4. Latency (response time) с квантилями по 0.5, 0.95, 0.99, max
5. RPS
6. Error Rate - количество 500ых ответов
Настроить алертинг в графане на Error Rate и Latency.
На выходе должно быть:

0. скриншоты дашборды с графиками в момент стресс-тестирования сервиса. Например, после 5-10 минут нагрузки.
 ![](https://github.com/kompasvideo/otus_2.11/blob/main/grafana/RPS.png)
![](https://github.com/kompasvideo/otus_2.11/blob/main/grafana/Latency%200.5%200.95.png)
![](https://github.com/kompasvideo/otus_2.11/blob/main/grafana/Latency%200.99%20max.png)
![](https://github.com/kompasvideo/otus_2.11/blob/main/grafana/Error%20Rate%20500.png)

1. json-дашборды.
В папке "grafana" файл "grafana.json"
