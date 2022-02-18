package ua.HCourse.build.jar;
/**
 * 2. Создать перечисление LoggingLevel. Состоит из значений: INFO, DEBUG.
 * Таблица видимости:
 * | LEVEL | INFO | DEBUG |
 * | INFO	|   X  |       |
 * | DEBUG |   X  |   X   |
 * То есть, если активирован уровень DEBUG, то в него также включается INFO, но не наоборот.
 */

public enum LoggingLevel {
    INFO, DEBUG;
}
