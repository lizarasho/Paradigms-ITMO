# Paradigms-ITMO

## package queue
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