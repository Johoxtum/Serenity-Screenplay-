Feature: Deseo realizar un registro en la pagina web

  Scenario Outline: Registro de un usuario en la pagina web
    Given El usuario ingresa a la plataforma para registrarse
    When ingresa los siguientes datos
      | FirstName       | <FirstName>      |
      | LastName        | <LastName>       |
      | Email           | <Email>          |
      | Gender          | <Gender>         |
      | Mobile          | <Mobile>         |
      | Month           | <Month>          |
      | Year            | <Year>           |
      | Day             | <Day>            |
      | Subjects        | <Subjects>       |
      | Hobbies         | <Hobbies>        |
      | Picture         | <Picture>        |
      | Current         | <Current>        |
      | State           | <State>          |
      | City            | <City>           |
    Then Se valida el mensaje de registro exitoso Thanks for submitting the form

    Examples:

      |FirstName|LastName|Email             |Gender|Mobile    |Month   |Year|Day|Subjects|Hobbies |Picture |Current      |State  |City   |
      |Juan     |Perez   |Pedro123@gmail.com|Male  |3125468974|January|1992|2  |Maths    |Sports |Prueba |Calle25#35-12|Haryana|Panipat|
      |Pablo    |Villa   |Villa123@gmail.com|Other |3125468945|March   |1995|2 |Chemistry|Reading|Prueba |Calle25#35-12|NCR    |Gurgaon|
      |Marcela  |Alvarez |Marcela13@gmail.com|Female|3125468123|April  |1993|2 |Physics  |Music  |Prueba |Calle25#20-24|Rajasthan|Jaiselmer|