# CurrencyChartFX-Java-17-Maven

Maven JavaFX IntelliJ IDEA project - Construction of charts of currencies of NBU on years for watching of tendencies of change.
- Java 17, JavaFX, Maven, JasperReports, JDBC (MS SQL 2019, Oracle XE 21c, PostgreSQL 14, SQLite, MySQL).

Загрузка первичных курсов
- https://bank.gov.ua/control/uk/curmetal/currency/search/form/period
- Указать период и экспорт JSON

Первичная настройка:
- скачать и установить IntelliJ IDEA Community
- скачать и установить Git
- скачать и установить jdk-17_windows-x64_bin.exe
- скачать и установить SceneBuilder-17.0.0
- скачать и установить TIB_js-studiocomm_6.18.1_windows_x86_64.exe
- скачать и настроить Maven
- настроить Github в IntelliJ IDEA Community (Settings - Version Control - Github)

- скачать Download Microsoft JDBC Driver for SQL Server - (sqljdbc_9.4.1.0_rus.zip).
  - Файл mssql-jdbc_auth-9.4.1.x64.dll скопировать в windows\system32 для подключения в java

  - При разработке отчетов в Jaspersoft® Studio 6.18.1 для MSSQL 2019 возникает ошибка
    java.lang.UnsatisfiedLinkError: Native Library .\mssql-jdbc_auth-9.4.1.x64.dll already loaded in another classloader) методы лечения в интернете не подошли
    При выполнении в java не появляется, видимо проблема Jaspersoft® Studio 6.18.1

Настройка JavaFX
- https://www.jetbrains.com/help/idea/javafx.html#check-plugin
- IntelliJ IDEA -> File -> Settings -> Languages and Frameworks -> JavaFX -> Указать путь к SceneBuilder (C:\Users\Admin\AppData\Local\SceneBuilder\SceneBuilder.exe)
- Папка при смене версии JavaFX не менять = \javafx-sdk\

Настройка отчетов:
- TIB_js-studiocomm_6.18.1_windows_x86_64.exe, запустить TIBCO Jaspersoft Studio-6.18.1
- распаковать JaspersoftWorkspace.7z в C:\Users\Admin\JaspersoftWorkspace

Сборка
- Build - Build Artifacts.. - Build

Fix:
Exception in thread "main" java.lang.SecurityException: Invalid signature file digest for Manifest main attributes
- IntelliJ IDEA -> File -> Project Structure -> Add New (Artifacts) -> jar -> From Modules With Dependencies on the Create Jar From Module Window:
- Select you main class
- JAR File from Libraries Select copy to the output directory and link via manifest

!!! Для JAR удалять Artifacts и создавать заново при добавлении новых в maven (IntelliJ IDEA -> File -> Project Structure -> Add New (Artifacts) -> jar).