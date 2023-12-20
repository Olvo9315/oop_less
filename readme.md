# Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

1) Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
4) В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели,
а также там же написать возникшие при выполнении дз вопросы
(если они есть)

## Ответ: 
В данном случае при добавлении новых методов действия в базовый класс Animal, мы вынуждены переопределять эти методы для каждого подкласса, который не умеет совершать данное действие. Это делает код менее удобным и гибким.