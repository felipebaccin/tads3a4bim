# 1.0 criação do projeto 
 o projeto foi criado com o jboss forge 
 
# 2.0 Implementação de dependencias no POM.XML com o cdi setup 
depois de criado o projeto voce deve se abrir o forge mais uma vez e colocar as dependencias com o cdi setup baixando as dependencias automaticamente  

e tambem o cdi setup cria o beans.xml  para fazer a injeção de dependencia no codigo
 
#3.0 criação do jpa 
com o forge cria o jpa com o wildfly colocando o nome da persistencia o banco que utiliza e o datasouce no jboss 
ele cria assim o arquivo persiste.xms dentro da parta metainf  

#4.0 criando a entity
com o forge voce cria toda a entidade altomaticamente depois disso cria os fields tambem como o forge 

#5.0 scaffoud
e por final se da o scaffoud para poder criar as interfaces com a entidade 