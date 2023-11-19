# M2S06-task

### POST (inserir tarefa):
```json
{
  "description": "Tarefa 1",
  "status": "PENDING",
  "priority": "MEDIUM",
  "assigneeName": "Matheus"
}
```
### GET (consultar tarefa):
```code
http://localhost:8080/clamed/task
http://localhost:8080/clamed/task?status=PENDING
http://localhost:8080/clamed/task?priority=MEDIUM
http://localhost:8080/clamed/task?owner=Matheus
```
### PUT (alterar tarefa):

```code
http://localhost:8080/clamed/task/{id}
```
```json
{
  "description": "Tarefa 1 Alteração",
  "status": "COMPLETED",
  "priority": "HIGH",
  "assigneeName": "Cauã"
}
```
### PUT (deletar tarefa):

```code
http://localhost:8080/clamed/task/{id}
```