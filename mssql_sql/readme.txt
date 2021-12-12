Взять из проекта на GitHub - Microsoft_SQL_Server_2019

+
Включить для работы jdbc:
- You need to Go to Start > Microsoft SQL Server > Configuration Tools > SQL Server Configuration Manager
- SQL Server Configuration Manager > SQL Server Network Configuration > Protocols for MSSQLSERVER

Где вы найдете протокол TCP/IP, если он отключен, затем Включите его. Нажмите на TCP/IP, вы найдете его свойства.
В этих свойствах Удалите все динамические порты TCP и добавьте значение 1433 во все TCP-порт и перезапустите службы SQL Server > SQL Server
