# EMS - AlgaSensors Temperature Monitoring

Microserviço responsável pelo monitoramento e armazenamento de leituras de temperatura dos sensores no sistema EMS AlgaSensors.

## Funcionalidades

- Armazenamento de logs de temperatura recebidos dos sensores
- Consulta de leituras de temperatura por sensor e período
- Monitoramento do estado dos sensores (ativo/inativo)
- Consulta do histórico de leituras

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.x
- JPA/Hibernate
- H2 Database (para desenvolvimento)
- Lombok
- Gradle

## Como Executar

1. Certifique-se de ter clonado o repositório principal com os submódulos:
   ```sh
   git clone --recurse-submodules git@github.com:tiquinhonew/ems-algasensors-temperature-monitoring.git
   ```

2. Acesse a pasta do microserviço:
   ```sh
   cd microservices/temperature-monitoring
   ```

3. Execute o serviço:
   ```sh
   ./gradlew bootRun
   ```

O serviço estará disponível em `http://localhost:8082`.

## Endpoints Principais

- `POST /temperatures` – Registrar nova leitura de temperatura
- `GET /temperatures` – Listar todas as leituras de temperatura
- `GET /temperatures?sensorId={id}&from={data}&to={data}` – Consultar leituras por sensor e período
- `GET /sensors/{id}/status` – Consultar status do sensor

## Configuração

O microserviço utiliza o banco de dados H2 em memória para desenvolvimento. As configurações podem ser ajustadas no arquivo `application.yml`.

## Testes

Para rodar os testes automatizados:
```sh
./gradlew test
```

## Licença

MIT License © Douglas Moraes