#Тюкало Кирилл
1.  Создать консольное приложение.
2.  создать пользователя
      *создать публичный массив 
      *добавить в массив логин(0 элемент массива) 
      *добавить пароль(1 элемент массива),хэшированный следующим образом DigestUtils.md5Hex(DigestUtils.md5Hex(pass)+salt)  
3.  Вывести переданные данные(для теста)в формате:
      *login "логин"
      *pass "пароля"
      *-res (ресурс)
      *-role (роль)
      *-ds и -de (дата)
4.  принять параметр login "логин" (строка из букв и цифр)
      *проверить совпадают ли login с заданным в программе логином
      *если логин не совпадает вывести код 1
5.  принять параметр pass "пароля" (строка из букв и цифр)
      *хэшировать пароль
      *подключаем класс DigestUtils 
      *Хэшируем следующим образом DigestUtils.md5Hex(DigestUtils.md5Hex(pass)+salt) ссылка на ресурс 1  	 ссылка на ресурс 2
6.  проверить совпадают ли pass с уже имеющимся в программе паролем
      *если пароль не совпадает вывести код 2
7.  написать тест 
8.  принять параметр -res 
      *преобразовать параметр -res в массив данных, где каждый следующий элемент массива это кусок строки между точками
      *проверить удовлетворяют ли элементы массива(созданного в пункте 12) условию  [a-zA-Z]{1,10}
9. принять параметр -role "РОЛЬ" (Где роль одно из: READ, WRITE, EXECUTE)
      *проверить, если введено что то не соответствующие одной любой из трех констант ( READ, WRITE, EXECUTE)
      *вывести код 3
      *в случае вызова роли READ или EXECUTE предоставить доступ к нужному ресурсу включая потомков
10. с помощью метода  java.time.Instant.toString()  занести в массив данные о времени доступа к ресурсу 
11. передать данные об объеме 
12. проверить, если (не один параметр не передан либо они не удовлетворяют условию либо передан параметр -h) вывести справку по параметрам 
13. допустить условие передачи параметров в любом порядке