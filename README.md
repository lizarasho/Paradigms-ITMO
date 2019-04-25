# Paradigms-ITMO

## expression_parser
#### Вычисление выражений
 * Реализовать интерфейсы `Expression`, `DoubleExpression`, `TrippleExpression`
#### Разбор выражений
 * Класс `ExpressionParser` должен реализовывать интерфейс `Parser`
#### Обработка ошибок
 * Классы `CheckedAdd`, `CheckedSubtract`, `CheckedMultiply`,
        `CheckedDivide` и `CheckedNegate` должны реализовывать интерфейс
        `TripleExpression`
 * Нельзя использовать типы `long` и `double`
 * Нельзя использовать методы классов `Math` и `StrictMath`
#### Вычисление в различных типах
Модификации
 * *Базовая*
    * Класс `GenericTabulator` должен реализовывать интерфейс
      `Tabulator` и
      сроить трехмерную таблицу значений заданного выражения.
        * `mode` — режим вычислений:
           * `i` — вычисления в `int` с проверкой на переполнение;
           * `d` — вычисления в `double` без проверки на переполнение;
           * `bi` — вычисления в `BigInteger`.
        * `expression` — выражение, для которого надо построить таблицу;
        * `x1`, `x2` — минимальное и максимальное значения переменной `x` (включительно)
        * `y1`, `y2`, `z1`, `z2` — аналогично для `y` и `z`.
        * Результат: элемент `result[i][j][k]` должен содержать
          значение выражения для `x = x1 + i`, `y = y1 + j`, `z = z1 + k`.
          Если значение не определено (например, по причине переполнения),
          то соответствующий элемент должен быть равен `null`.
 * *AsmUfb*
    * Дополнительно реализовать унарные операции:
        * `abs` — модуль числа, `abs -5` равно 5;
        * `square` — возведение в квадрат, `square 5` равно 25.
    * Дополнительно реализовать бинарную операцию (максимальный приоритет):
        * `mod` — взятие по модулю, приоритет как у умножения (`1 + 5 mod 3` равно `1 + (5 mod 3)` равно `3`).
    * Дополнительно реализовать поддержку режимов:
        * `u` — вычисления в `int` без проверки на переполнение;
        * `f` — вычисления в `float` без проверки на переполнение;
        * `b` — вычисления в `byte` без проверки на переполнение.
 * *Ls*
    * Дополнительно реализовать поддержку режимов:
        * `l` — вычисления в `long` без проверки на переполнение;
        * `s` — вычисления в `short` без проверки на переполнение.
 * *Ufb*
    * Дополнительно реализовать поддержку режимов:
        * `u` — вычисления в `int` без проверки на переполнение;
        * `f` — вычисления в `float` без проверки на переполнение;
        * `b` — вычисления в `byte` без проверки на переполнение.
   
   
   
   
## functional_js
#### Функциональные выражения на JavaScript
1. Разработайте функции `cnst`, `variable`, `add`, `subtract`, `multiply`, `divide`, negate для вычисления выражений с одной переменной.
2. *Усложненный вариант.* Требуется написать функцию `parse`, осуществляющую разбор выражений, записанных в обратной польской записи.
3. При выполнение задания следует обратить внимание на:
   * Применение функций высшего порядка.
   * Выделение общего кода для бинарных операций.
   
Модификации
 * *Базовая*
    * Код должен находиться в файле `functionalExpression.js`.
 * *OneIffAbs*. Дополнительно реализовать поддержку:
    * переменных: `y`, `z`;
    * констант:
        * `one` — 1;
        * `two` — 2;
    * операций:
        * `abs` — абсолютное значение, `-2 abs` равно 2;
        * `iff` — условный выбор:
            если первый аргумент неотрицательный,
            вернуть второй аргумент,
            иначе вернуть первый третий аргумент.
            * `iff one two 3` равно 2
            * `iff -1 -2 -3` равно -3
            * `iff 0 one two` равно 1;
  
  
   
   
## md2html
#### Markdown to HTML
1. Разработайте конвертер из Markdown-разметки в HTML.
2. Конвертер должен поддерживать следующие возможности:
    * Абзацы текста разделяются пустыми строками.
    * Элементы строчной разметки: выделение (* или _), сильное выделение (** или __ ), зачеркивание (--), код ( \`)
    * Заголовки (# * уровень заголовка)
3. Конвертер должен называться Md2Html и принимать два аргумента: название входного файла с Markdown-разметкой и название выходного файла c HTML-разметкой. Оба файла должны иметь кодировку UTF-8.

Модификации
 * *Базовая*
 * *Link*
    * Добавьте поддержку ```[ссылок с _выделением_](https://kgeorgiy.info)```:
        ```&lt;a href='https://kgeorgiy.info'>ссылок с &lt;em>выделением&lt;/em>&lt;/a>```
 * *Underline*
    * Добавьте поддержку `++подчеркивания++`: `<u>подчеркивания</u>`
 * *Image*
    * Добавьте поддержку ```![картинок](http://www.ifmo.ru/images/menu/small/p10.jpg)```:
        ```&lt;img alt='картинок' src='http://www.ifmo.ru/images/menu/small/p10.jpg'&gt;```
 * *Mark*
    * Добавьте поддержку `~выделения цветом~`: `<mark>выделения цветом</mark>`
 * *All*
    * Добавьте поддержку всех вышеперечисленных модификаций




## object_js
#### Объектные выражения на JavaScript
1. Разработайте классы `Const`, `Variable`, `Add`, `Subtract`, `Multiply`, `Divide`, `Negate` для представления выражений с одной переменной.
    * Пример описания выражения 2x-3:
                        `let expr = new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3));`
    * Метод `evaluate(x)` должен производить вычисления вида: При вычислении такого выражения вместо каждой переменной подставляется значение x, переданное в качестве параметра функции evaluate (на данном этапе имена переменных игнорируются).
    * Метод `toString()` должен выдавать запись выражения в обратной польской записи. Например, expr.toString() должен выдавать 2 x * 3 -.
2. *Усложненный вариант.* Метод `diff("x")` должен возвращать выражение, представляющее производную исходного выражения по переменной x. Например, `expr.diff("x")` должен возвращать выражение, эквивалентное `new Const(2)`.
3. *Бонусный вариант.* Требуется написать метод `simplify()`, производящий вычисления константных выражений. Например,
`parse("x x 2 - * 1 *").diff("x").simplify().toString()` должно возвращать `x x 2 - +`.
4. При выполнение задания следует обратить внимание на:
    * Применение инкапсуляции.
    * Выделение общего кода для операций.
    
 Модификации
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
 * *ArcTan*. Дополнительно реализовать поддержку:
    * функций:
        * `ArcTan` (`atan`) — арктангенс, `1256 atan` примерно равно 1.57;
        * `ArcTan2` (`atan2`) — арктангенс, `841 540 atan2` примерно равно 1;
#### Обработка ошибок на JavaScript
1. Добавьте в предыдущее домашнее задание функцию `parsePrefix(string)`, разбирающую выражения, задаваемые записью вида `(- (* 2 x) 3)`. Если разбираемое выражение некорректно, метод `parsePrefix` должен бросать человеко-читаемое сообщение об ошибке.
2. Добавьте в предыдущее домашнее задание метод `prefix()`, выдающий выражение в формате, ожидаемом функцией `parsePrefix`.
3. При выполнение задания следует обратить внимание на:
    * Применение инкапсуляции.
    * Выделение общего кода для бинарных операций.
    * Обработку ошибок.
    * Минимизацию необходимой памяти.
    
Модификации
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
 * *PrefixSumexpSoftmax*. Дополнительно реализовать поддержку:
    * операций произвольного числа аргументов:
        * `Sumexp` (`sumexp`) — сумма экспонент, `(8 8 9)` примерно равно 14065;
        * `Softmax` (`softmax`) — softmax первого аргумента, `(softmax 1 2 3)` примерно равно 9;
 * *PostfixSumexpSoftmax*. Дополнительно реализовать поддержку:
    * выражений в постфиксной записи: `(2 3 +)` равно 5
    * унарных операций:
        * `Sumexp` (`sumexp`) — сумма экспонент, `(8 8 9 sumexp)` примерно равно 14065;
        * `Softmax` (`softmax`) — softmax первого аргумента, `(1 2 3 softmax)` примерно 9;
   
   


## queue
#### Очередь на массиве
 * Реализовать методы
    * `push` – добавить элемент в начало очереди
    * `peek` – вернуть последний элемент в очереди
    * `remove` – вернуть и удалить последний элемент из очереди
#### Очередь на связном списке
 * Добавить в интерфейс очереди и реализовать методы
     * `filter(predicate)` – создать очередь, содержащую элементы, удовлетворяющие
            [предикату](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
    * `map(function)` – создать очередь, содержащую результаты применения
            [функции](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
 * Исходная очередь должна остаться неизменной
 * Тип возвращаемой очереди должен соответствовать типу исходной очереди
 * Взаимный порядок элементов должен сохраняться
 * Дублирования кода быть не должно
