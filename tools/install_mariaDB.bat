::指定创建服务的程序
@set mysql_service="./mariadb-10.6.4-winx64/bin/mysqld.exe"
::设置服务名
@set service_name="MariaDB"
::开始安装Mariadb服务
%mysql_service% --install %service_name%

::启动服务
net start MariaDB
:: 进入mmariaDB
:: %root_directory%mysql -uroot -p123456

:: ./mariadb-10.6.3-winx64/bin/mysql -uroot -p123456

