## Тестовое задание QA

Сервис, который принимает и отвечает на HTTP запросы

1. #### Запросы:
    * GET `/city` - получение списка всех городов
    * GET `/city/street` - получение всех улиц города
    * POST `/shop` - создание магазина (Получает json c объектом магазина, в ответ возвращает id созданной записи)
    * GET `/shop/?street=&city=&open=0/1` - — получение списка магазинов (Параметры не обязательны. В случае отсутствия параметров выводятся все магазины, если хоть один параметр есть, то по нему выполняется фильтрация.)

2. #### Информация для использования программы:
   * База данных: PostgreSQL
   -необходимо создать БД с названием - _ShopManagement_, либо изменить название в application.properties,
   -указать свой пароль, имя пользователя в application.properties
   -порт - 9797
   * Заполнение БД
   -в папке resources скрипты для insert 
   * Коллекция Postman
   -[https://api.postman.com/collections/26014086-117e143e-d81b-4824-8fdc-5ec9e4e5cd2c?access_key=PMAT-01GXGJ3BXABQA5041RQ5AARP7W](https://api.postman.com/collections/26014086-117e143e-d81b-4824-8fdc-5ec9e4e5cd2c?access_key=PMAT-01GXGJ3BXABQA5041RQ5AARP7W)
   
