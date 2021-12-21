package com.company.homework16;

/**2. Создать перечисление LoggingLevel. Состоит из значений: INFO, DEBUG.
 Таблица видимости:
 | LEVEL | INFO | DEBUG |
 | INFO	|   X  |       |
 | DEBUG |   X  |   X   |
 То есть, если активирован уровень DEBUG, то в него также включается INFO, но не наоборот.*/

public enum LoggingLevel {
    LEVEL("LEVEL"), INFO("INFO"), DEBUG("DEBUG");

//	private final String m_name;
//
//	LoggingLevel(String name) {
//		m_name = name;
//	}
//
//	public static LoggingLevel stringToLevel(String s) {
//		LoggingLevel result = LoggingLevel.DEBUG;
//		for (LoggingLevel l : LoggingLevel.values()) {
//			if (l.toString().equals(s)) {
//				result = l;
//			}
//		}
//		return result;
//	}
    LoggingLevel(String level) {
    }
}
