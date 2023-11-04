# WebSocket
Um websocket é uma conexão contínua entre o cliente e o servidor. Porém, se não forem usadas threads, o servidor apenas consegue atender um cliente por vez. Este exercício utiliza dois tipos de servidores para demonstrar este funcionamento.

## WebSocket sem Threads
- Abra e inicie o arquivo `ServerNoThread.java`.
- Abra o arquvio `Client.java` em outra janela e inicie.
- Usando o console do cliente, envie mensagens ao servidor e veja as mensagens voltarem.
- Abra outro `Client.java` em outra janela e tente iniciar. Perceba que a conexão não é feita.

**Explicação:** O servidor já está ocupado com um cliente.

## WebSocket com Threads
- Abra e inicie o arquivo `ServerWithThreads.java`.
- Abra o arquvio `Client.java` em outra janela e inicie.
- Usando o console do cliente, envie mensagens ao servidor e veja as mensagens voltarem.
- Abra outro `Client.java` em outra janela e inicie. A conexão é feita.
- Usando o console do outro cliente, envie mensagens ao servidor e veja as mensagens voltarem.

**Explicação:** O servidor abre uma thread para cada conexão com um cliente.
