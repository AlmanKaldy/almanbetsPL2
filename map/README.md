# HashMap practice (8 exercises)

В этой папке собраны 8 небольших практических заданий по `HashMap<String, Integer>`.

> Важно: в Java имя **public class** должно совпадать с именем файла и быть валидным идентификатором. Поскольку имена файлов начинаются с цифры (`1_...`, `2_...`), в файлах использованы валидные *непубличные* классы с `main`.

## Список заданий

1. **Create & Put** (`1_CreateAndPut.java`)  
   Создание `HashMap`, добавление `Aida`, `Azat`, `Dana`, вывод map и `size()`.

2. **Get & containsKey** (`2_GetAndContainsKey.java`)  
   Проверка `get("Aida")`, `get("Mira")`, а также `containsKey("Mira")` с понятным выводом.

3. **Update Existing Value** (`3_UpdateExistingValue.java`)  
   Обновление `Dana` до `80`, вывод старого значения из `put` и новой map.

4. **Remove by Key** (`4_RemoveByKey.java`)  
   Удаление `Azat`, попытка удалить `NonExisting`, вывод результатов.

5. **isEmpty & clear** (`5_IsEmptyAndClear.java`)  
   Проверка `isEmpty()` до/после `clear()`, затем повторное добавление 2 элементов.

6. **getOrDefault** (`6_GetOrDefault.java`)  
   Использование `getOrDefault("Mira", -1)`, вывод `Not found` при `-1`, проверки для нескольких имен.

7. **putIfAbsent** (`7_PutIfAbsent.java`)  
   Проверка поведения для существующего (`Aida`) и нового (`Mira`) ключа, вывод map.

8. **replace** (`8_Replace.java`)  
   Демонстрация `replace(key, oldValue, newValue)`, `replace(key, value)` и попытки замены отсутствующего ключа.

## Как запускать

Из корня репозитория:

```bash
# Пример для задания 1
javac map/1_CreateAndPut.java
java -cp map One_CreateAndPut
```

Аналогично для остальных файлов:

```bash
javac map/2_GetAndContainsKey.java && java -cp map Two_GetAndContainsKey
javac map/3_UpdateExistingValue.java && java -cp map Three_UpdateExistingValue
javac map/4_RemoveByKey.java && java -cp map Four_RemoveByKey
javac map/5_IsEmptyAndClear.java && java -cp map Five_IsEmptyAndClear
javac map/6_GetOrDefault.java && java -cp map Six_GetOrDefault
javac map/7_PutIfAbsent.java && java -cp map Seven_PutIfAbsent
javac map/8_Replace.java && java -cp map Eight_Replace
```
