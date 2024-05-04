hi hi hi


  New Question 5:
===============



create the ec2 in N.Virginia region-->amazon-linux-->remaining all keep by the own-->security group ssh,http-->click advanced details

advanced details

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Mumbai region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the ip address and paste in chrome with :80

click the instances and stop the instances and after click the instances and click acton and click images and templates-->click create image-->name the image-->click add new tag and write anything in that-->click create image

go to N.Virginia region-->click ami-->click action-->click copy ami-->click ohio region in destination region-->click copy ami

go to ohio region--click ami-->click launch instances from ami-->all the thing are own-->copy the code and paste in advanced details-->

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Singapore region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the public of singpore and paste in chrome









New Question 1:
===============

create an azure vm from central using ubuntu attach  addtional 8gb volume
==========================================================================


create resource group-->click virtual machine-->name it-->choose ubuntu-->remaining all are same-->choose standard ssd-->click review+create-->click create

search disks in search box-->click create-->choose the resource group-->name it-->click change size-->click review+create-->click create

go the vm ware that we created-->click disk in right side-->in bottom click attach existing disk-->click the dropdown box and attach the size that we created -->click apply







   Question 2:
===============

create the ec2 instance-->name it-->choose amazon linux-->security group-----22,8080,80-->click launch instance

connect to the command prompt

#sudo su -

#yum install docker* -y

#systemctl start docker

#systemctl enable docker

#systemctl status docker

#rpmquery docker

#docker pull ubuntu:latest

#docker images

#docker run -it --name web-server -p 8080:80 ubuntu:latest /bin/bash

#apt-get update -y

#apt-get install apache2 -y

#cd /var/www/html/

#echo "devops" > index.html

#ll

#service apache2 start

ctrl p+q

#docker ps -a

##docker inspect web-server | less

copy the ip address and paste in chrome
