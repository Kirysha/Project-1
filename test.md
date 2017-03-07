# Тесты
входные данные | exit-коды | коментарий
------------ | ------------- | -------------
:one: login “123” :two: pass “123”  :three: res “a.b.c”  :four: rol “read”  :five: ds “2015-12-10”  :six: vol “100” | 0 | данные верны
:one: login “999999” :two: pass “123”  :three: res “a.b.c”  :four: rol “read”  :five: ds “2015-12-10”  :six: vol “100” | 1 |Логин не найден
:one: login “123” :two: pass “9999999”  :three: res “a.b.c”  :four: rol “read”  :five: ds “2015-12-10”  :six: vol “100” | 2 |пароль не верный
:one: login “123” :two: pass “123” :three: res “a.asd.q.ss” :four: rol “re” :five: ds “2015-12-10” :six: vol “100” | 3 | ресурса не существует 
:one: login “123” :two: pass “123”  :three: res “a.b” :four: rol “read” :five: ds “2015-12-10” :six: vol “100” | 4 | нет доступа к ресурсу 
:one: login “123” :two: pass “123” :three: res “a.b.c” :four: rol “read” :five: ds “1-15-48” :six: vol “0” | 5 | некорректная активность, дата не верна либо объем не действителен 
