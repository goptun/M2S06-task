# M2S06-task

### POST:
```json
{
  "description": "Tarefa 1",
  "status": "PENDING",
  "priority": "MEDIUM",
  "assigneeName": "Matheus"
}
```
#### GET:
```code
http://localhost:8080/clamed/task
http://localhost:8080/clamed/task?status=PENDING
http://localhost:8080/clamed/task?priority=MEDIUM
http://localhost:8080/clamed/task?owner=Matheus
```
