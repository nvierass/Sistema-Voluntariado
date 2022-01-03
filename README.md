# TBD_Lab_2
Instrucciones de Ejecucion
    
    - Backend
        1. Ingresar al directorio siguiente "Backend\src\main\resources".
        2. Abrir el archivo "application.properties" y modificar los valores de acuerdo a la configuración personal de postgres.(port, user, password).
        3. Regresar e ingresar a la carpeta “Backend” del proyecto.
        4. Abrir la consola en la carpeta.
        5. Ejecutar el comando “gradle tasks”.
        6. Luego ejecutar el comando “./gradlew boot run”

    - Frontend
        1. Ingresar a la carpeta “Frontend” del proyecto
        2. Luego ingresar a la carpeta lab2_TBD
        3. Para ejecutar el programa y que funcione y se vea algo, se debe tener instalado nuxt, para ello se usa el comando “npm install nuxt”.
        4. Ingresar el comando “npm run dev” y copiar la dirección que se entregará en el cmd en el navegador de internet. 

    - BD
        1. A continuación se mostraran los pasos para la creación y población de la base de datos para los sistemas operativos linux y windows respectivamente.
        
        Linux 
            1. Ingresar a la consola.
            2. Ejecutar el comando “sudo -i -u postgres” para cambiar al usuario de Postgres.
            3. Ingresar el comando “psql” para acceder a la consola de Postgres.
                3.1 Ingresar el comando “\i ‘/.../ruta/.../dbScript.sql’”.
                3.2 Ingresar el comando “\i ‘/.../ruta/.../loadData.sql’”.

        Windows
            1. Ingresar a la consola SQL Shell (psql).
            2. Al aparecer Server [localhost], apretar Enter.
            3. Al aparecer Database [postgres], apretar nuevamente Enter.
            4. Al aparecer Port [5432], apretar nuevamente Enter.
            5. Al aparecer Username [postgres], apretar nuevamente Enter.
            6. Al aparecer Contraseña para usuario postgres, ingresar la contraseña definida previamente para postgres y apretar Enter, asegurándose de ingresarla correctamente.
                a. Si la contraseña se ingresa incorrectamente, reintentar desde paso 1.
            7. Para comenzar se debe ejecutar el siguiente código en la consola. \i '..../dbCreate.sql' donde se debe incluir la ruta absoluta del archivo antes de /dbCreate.sql. 

                Ejemplo Windows:
                \i ‘C:/dbCreate.sql” 

            8. Luego se debe ejecutar el siguiente comando en la consola \i '..../loadData.sql' donde también se debe incluir la ruta absoluta del archivo antes de /loadData.sql. 
            
                Ejemplo Windows:
                \i ‘C:/loadData.sql”

