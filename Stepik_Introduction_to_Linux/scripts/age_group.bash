#!/bin/bash

: '
3.3.9
Напишите скрипт на bash, который будет определять в какую возрастную группу попадают пользователи. При запуске скрипт должен вывести сообщение "enter your name:" и ждать от пользователя ввода имени (используйте read, чтобы прочитать его). Когда имя введено, то скрипт должен написать "enter your age:" и ждать ввода возраста (опять нужен read). Когда возраст введен, скрипт пишет на экран "<Имя>, your group is <группа>", где <группа> определяется на основе возраста по следующим правилам:

младше либо равно 16: "child",
от 17 до 25 (включительно): "youth",
старше 25: "adult".
После этого скрипт опять выводит сообщение "enter your name:" и всё начинается по новой (бесконечный цикл!). Если в какой-то момент работы скрипта будет введено пустое имя или возраст 0, то скрипт должен написать на экран "bye" и закончить свою работу (выход из цикла!).
'

while true
do 
    echo "enter your name:"
    read  name
if [[ -z $name ]]
    then echo "bye"
    break
fi
    echo "enter your age:"
    read  age
if [[ $age -eq 0 ]]
then    echo "bye"

        break
elif [[ $age -ge 0 ]] && [[ $age -le 16 ]]
then
        echo "$name, your group is child"
elif [[ $age -ge 26 ]]
then
        echo "$name, your group is adult" 
elif [[ $age -ge 17 ]] && [[ $age -le 26 ]]
then 
        echo "$name, your group is youth"           
fi
continue
done
