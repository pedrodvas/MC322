Uso dos princípios SOLID:

    - Single-responsibility principle
Como é possível ver no código, todas as funções no código dadas em cada classe alteram apenas ela mesma, por exemplo, a parte de torna professor em membro, que se restringe a apenas tomar os parâmetros necessários para formar um membro e não altera nenhuma parte a mais que o necessário

    - Open closed principle
Uma das formas de se utilizar o Open Closed principle no código é por exemplo ao extender a classe estudante para estudante de pós graduação, assim respeitamos o fato de que alterações não devem ser feitas em código já estabelecido ao mesmo tempo que tornamos possível fazer extensões deste

    - Liskov substitution principle
Como é possível ver em torna membro para EstudantePosGrad, é possível observar que EstudantePosGrad pode assumir todas as responsabilidades de Membro sem que hajam erros no código

    - Dependency inversion principle
Como é possível observar no design de revista.java, a classe se baseou em um princípio abstrato para a sua construção, assim a manutenção do código de revistas se torna mais simples
