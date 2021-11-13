# CurrencyChartFX-Java-Maven-17
Maven JavaFX IntelliJ IDEA project - Construction of charts of currencies of NBU on years for watching of tendencies of change.
Java, JavaFX, Maven, SQLite, MySQL, JasperReports

Загрузка первичных курсов
- https://bank.gov.ua/control/uk/curmetal/currency/search/form/period
- Указать период и экспорт JSON

Настройка JavaFX
- https://www.jetbrains.com/help/idea/javafx.html#check-plugin
- IntelliJ IDEA -> File -> Settings -> Languages and Frameworks -> JavaFX -> Указать путь к SceneBuilder
- Папка при смене версии JavaFX не менять = \javafx-sdk\

Fix:
Exception in thread "main" java.lang.SecurityException: Invalid signature file digest for Manifest main attributes
- IntelliJ IDEA -> File -> Project Structure -> Add New (Artifacts) -> jar -> From Modules With Dependencies on the Create Jar From Module Window:
- Select you main class
- JAR File from Libraries Select copy to the output directory and link via manifest
