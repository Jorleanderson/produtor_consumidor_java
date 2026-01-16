🧵 Projeto Java —  Produtor–Consumidor com Threads e Monitor

Este projeto implementa o clássico problema de concorrência Produtor–Consumidor utilizando threads em Java e o padrão de Monitor, com foco no entendimento prático de sincronização, exclusão mútua e coordenação entre threads.

O objetivo principal foi reforçar a base em programação concorrente, essencial para o desenvolvimento de aplicações backend, especialmente em ambientes como Spring Boot e arquiteturas de microserviços, onde múltiplas requisições são processadas simultaneamente por pools de threads.

Objetivos de Aprendizado:

Compreender como funciona o acesso concorrente a recursos compartilhados
Evitar inconsistência de estado e condições de corrida (race conditions)

Entender o uso correto de:

synchronized

wait()

notifyAll()

Aplicar o padrão de Blocos Guardados (Guarded Block

🔹 Monitor

Responsável por controlar o acesso ao recurso compartilhado (produto), garantindo:

Exclusão mútua
Espera quando o buffer está cheio ou vazio
Comunicação correta entre produtor e consumidor

🔹 Produtor

Gera itens e solicita ao monitor a inserção no recurso compartilhado.

🔹 Consumidor

Solicita ao monitor o consumo do item, respeitando as regras de sincronização.
