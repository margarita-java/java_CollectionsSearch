# 🚗 Java Cool Numbers Generator

> Generate and search 2+ million Russian license plates using various Java collections and search algorithms.  
> 📘 Генерация и поиск "красивых" автомобильных номеров. Выполнено в рамках обучения на платформе Skillbox.

---

## 🧩 Task Overview / Описание задания

Программа генерирует "красивые" автомобильные номера РФ по шаблону XNNNYZR:

- X, Y, Z — буквы из набора А, В, Е, К, М, Н, О, Р, С, Т, У, Х
- N — одинаковые цифры (например, 111, 777)
- R — регион от 01 до 199

📌 Пример: А111СХ197, У777НО66

Всего генерируется 2+ миллиона уникальных номеров.

---

## 🔍 Search Methods / Методы поиска

Программа реализует поиск по четырём коллекциям:

| Тип поиска               | Описание                       |
|--------------------------|--------------------------------|
| 🔁 Linear Search         | Перебор по ArrayList         |
| 🧮 Binary Search         | Поиск по сортированному ArrayList |
| 🧩 HashSet Search        | Поиск в HashSet              |
| 🌲 TreeSet Search        | Поиск в TreeSet              |

### 📊 Пример вывода:
Поиск перебором: номер найден, поиск занял 312983нс
Бинарный поиск: номер не найден, поиск занял 942нс
Поиск в HashSet: номер найден, поиск занял 46нс
Поиск в TreeSet: номер найден, поиск занял 81нс

---

## 🚀 How to Run / Как запустить

1. Установите Java (JDK 17+)
2. Откройте проект в IntelliJ IDEA
3. Запустите main() в CoolNumbers.java
4. Введите интересующий номер для поиска

---

## 🛠️ Technologies / Технологии

- Java 17  
- Collections: ArrayList, HashSet, TreeSet  
- Collections.binarySearch()  
- System.nanoTime() for performance measurement

---

## 📁 Project Structure / Структура проекта

java_cool_numbers/
├── src/
│ └── main/
│ └── java/
│ └── practice/
│ └── CoolNumbers.java
└── README.md

---

## 👩‍💻 Author / Автор

Маргарита Арюткина
