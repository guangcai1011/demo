::指定创建服务的程序
@set mysql_service="./mariadb-10.6.4-winx64/bin/mysqld.exe"
::设置服务名
@set service_name="MariaDB"
:: 停止服务
net stop MariaDB
:: 卸载服务
%mysql_service% --remove %service_name%
