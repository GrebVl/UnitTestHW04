1)  Почему использование тестовых заглушек может быть
полезным при написании модульных тестов?

С помощью таких заглушек, мы можем изолировать тестируемый код
и сосредоточиться только на поведении тестируемого блока.
Кроме того, изолированные юнит-тесты выполняются быстрее.

2) Какой тип тестовой заглушки следует использовать, 
если вам нужно проверить, что метод был вызван с определенными аргументами?

Моки — это классы-заглушки, которые используются чтобы проверить,
что определенная функция была вызвана с определенными аргументами.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть
определенное значение или исключение в ответ на вызов метода?

Stub (заглушка). Заглушка— объект, содержащий предопределённые данные 
и использует их для ответа на вызовы во время тестов.

Fake (заглушка). заменяет функциональность вызываемого
компонента альтернативной реализацией

4) Какой тип тестовой заглушки вы бы использовали для имитации
взаимодействия с внешним API или базой данных?

Fake (заглушка). заменяет функциональность вызываемого
компонента альтернативной реализацией


