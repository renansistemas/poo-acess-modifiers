# Projeto básico Java com o objetivo de testar os modificadores de acesso private, public, protected e default, juntamente à alguns conceitos de POO

**private:** o membro pode ser acessado apenas dentro da classe  
**public:** pode ser acessado por qualquer classe  
**protected:** o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes  
**default:** o membro pode ser acessado por classes do mesmo pacote  

# Construtor
- é uma operação especial da classe, que executa no momento da instanciação do objeto;
- se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão;
- é possível especificar mais de um construtor na mesma classe (sobrecarga);

# Sobrecarga
- é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros

# Encapsulamento
- é um princípio que consiste em proteger os dados de um objeto e permitir que eles sejam acessados ou modificados apenas de maneiras controladas.  
**Exemplo:** uma conta bancária que protege o saldo, não permitindo definir um valor negativo diretamente, sendo necessário passar pelo método depositar() ou sacar() para assim modificar o saldo.
