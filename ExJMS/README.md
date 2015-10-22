1.0 configuração do servidor 
primeiramente foi configurado o usuario do wildfly 9.x, tive que apagar todas as versões que eu tinha e comecar tudo de novo
assim configurando tudo rodei um projeto externo para ver se o mesmo estava funcionando e constatei o funcionamento do mesmo 

depois de constatar isso entrei no admin console do wildfly e configurei o tipo de mensagem uma sendo queue que se refera para
a implementação do aluno, e uma topic que se refere a implementação do professor.

2.0 criação do projeto 
por meio do jboss forge foi criado o projeto no eclipse sendo ele um projeto mavem gerado automaticamente pelo jboss forge 

no projeto foi criado um pacote entidade onde esta contido duas classes uma aluno e uma classe pojo professor com os atributos matricula e nome 
contendo tambem os gets e sets

em outro pacote com o nome de mdb esta contida as classes de mdb de aluno e de professor 
o aluno só existe uma e professor existe 3 classes identicas para fazer uma comparação 

e no ultimo pacote com o nome de servlet esta contido os dois servlets tambem de aluno e professor o de aluno esta funcionando normalmente mais o de professor esta tendo um erro no qual ele esta usando alguns recursos do jms 2.0 e na minha maquina só esta configurado o 1.1 

3.0 commits 
a cada criação de classe ou alteração das mesmas foi dado um commit and push para conter todas as alterações no github quando feito uma alteração muito grande tambem foi feito um commit no mesmo 

4.0 setup do jms e ejb 
para que podessemos usar o jms e o ejb no projeto temos que configurar alguns parametros no jboss forge onde o mesmo cria todas as instancias e baixa todos os componentes que precisa automaticamente.
