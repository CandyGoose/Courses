#!/bin/bash

: '
3.3.6
Напишите скрипт на bash, который принимает на вход один аргумент (целое число от 0 до бесконечности), который будет обозначать число студентов в аудитории. В зависимости от значения числа нужно вывести разные сообщения. 

Соответствие входа и выхода должно быть таким:
0 -->  No students
1 -->  1 student
2 -->  2 students
3 -->  3 students
4 -->  4 students
5 и больше --> A lot of students
'

case $1 in
        0)
        echo "No students"
        ;;
        1)
        echo "$1 student"
        ;;
        [2-4])
        echo "$1 students"
        ;;
        *)
        echo "A lot of students"
esac
