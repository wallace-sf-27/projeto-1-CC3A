feito por Rodrigo e Wallace 

Questoes respostas 

2  a classe necessita ser abstrata para poder servir de base para as outras classes no caso (Carro, moto, caminhão), o conceito de abstração é esconder os detalhes complexos 
de implementação e expor apenas as funcionalidades essenciais , simplificando o desenvolvimento do programa

2 herança permite que uma nova classe herde as propriedades e comportamentos de uma classe existente, criando hierarquia de classes para melhor reutilizar o código ,
nesse caso em especifico é bom porque tanto carro como moto ou caminhão são veículos e vão utilizar os atributos de um veiculo, como cor ano modelo vin e também seus métodos 
como acelerar e buzinar, assim tendo um código organizado e fluido 
2  possuindo  os atributos privados, você impede que outras partes do código modifiquem diretamente esses valor, oque dependendo da situação poderia ocasionar
em um problema ou erro, porém é possível controlar com os atributos que são acessados e modificados através de métodos getters e setters, no caso em especifico
proteger o vin é a prioridade já que não é qualquer um que deveria ter aceso a ele ou modificar ele , no casso só os métodos getters e setters seriam o bastante
para mexer no atributo se necessário
