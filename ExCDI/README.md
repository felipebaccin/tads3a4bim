1.0  criação do projeto 
por meio do jboss forge foi criado o projeto no eclipse sendo ele um projeto mavem gerado automaticamente pelo jboss forge 

no projeto foi criado um pacote entidade onde esta contido as classe item com os atributos value e limit
contendo tambem os gets e sets

em outro pacote com o nome de mdb esta contida as classes de mdb de aluno e de professor 
o aluno só existe uma e professor existe 3 classes identicas para fazer uma comparação 

e no ultimo pacote com o nome de servlet esta contido os dois servlets tambem de aluno e professor o de aluno esta funcionando normalmente mais o de professor esta tendo um erro no qual ele esta usando alguns recursos do jms 2.0 e na minha maquina só esta configurado o 1.1 

3.0 commits 
a cada criação de classe ou alteração das mesmas foi dado um commit and push para conter todas as alterações no github quando feito uma alteração muito grande tambem foi feito um commit no mesmo 

4.0 setup do jms e ejb 
para que podessemos usar o jms e o ejb no projeto temos que configurar alguns parametros no jboss forge onde o mesmo cria todas as instancias e baixa todos os componentes que precisa automaticamente.
