#UFABCTextRPG

##Descrição do programa

O intuito desse projeto foi criar um jogo baseado em texto de RPG, que contasse com um sistema de batalhas e exploração do mapa.


##Elaboração do projeto

O mapa do jogo é constituído de vários blocos menores, chamados de locações. Cada locação possui um número de saídas e possivelmente uma criatura cada. Para cada um dos citados, foi criado uma classe para criação e manipulação. Além disso, foi criada uma classes contendo o sistema de batalha, que recebe dois objetos do tipo criatura, um sendo o próprio jogador, e o outro o inimigo.

O jogador atravessa o mapa através de comando de texto, por pontos cardeais (norte, sul, leste, oeste), e comandos de batalha (atacar e defender).

A cada batalha ganha, o jogador evolui, recendo mais vida, ataque e defesa.
