# Задание 1 — обязательное
    
Статистика — очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]. Компании могут быть крупными, продажи могут быть до 5 млрд в месяц.

Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:

* сумму всех продаж;
* среднюю сумму продаж в месяц;
* номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
* номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
* количество месяцев, в которых продажи были ниже среднего (см. п.2);
* количество месяцев, в которых продажи были выше среднего (см. п.2).
**Примечание:** в вашем задании нужно найти последний месяц, соответствующий условиям.

Сервис должен представлять собой один класс с шестью методами — по методу на пункт. Входные данные для расчёта сервис должен принимать в параметрах своих методов. Обратите внимание, что написанный класс должен уметь работать с любыми корректными значениями в массиве продаж, а приведённый выше набор — это лишь пример данных для ваших тестов на методы создаваемого класса.

### Вам необходимо

Создать Maven-проект, в котором в package ru.netology.stats будет класс StatsService с необходимыми методами, сами придумайте им говорящие названия.
Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных.
Убедиться, что ваши автотесты работают и проходят.
