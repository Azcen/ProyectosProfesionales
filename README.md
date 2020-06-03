# ProyectosProfesionales

Los requisitos para la instalacion son los siguientes:
  - Se requiere un Editor de Texto un IDE especializado apra java(Ejemplos Spring Tool Suite 4 o Intellij IDEA)
  - Se requiere una base de datos MySQL, el nombre de la base de datos debe de ser "sensors"
      - La base de datos debe estar vacia, el proyecto se encargara de crear las tablas necesarias para funcionar
      - En caso de no generar las tablas, checar en el archivo a"pplication.properties" que en la opcion de base de datos en vez de ser "UPDATE" sea "CREATE-DROP", despues de inicar el proyecto por primera vez se recomienda cambiar de nuevo a "UPDATE, ya que de no hacerlo borrara los datos de la base de datos cada que se inicie el proyecto
