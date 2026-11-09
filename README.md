# Atividade SOLID — Sistema de Delivery

Java 17+. Cada pacote em `src/` demonstra um princípio e tem sua `Main`.

| Pacote | Princípio | Execução |
|---|---|---|
| srp | Single Responsibility | `java -cp out srp.Main` |
| ocp | Open/Closed | `java -cp out ocp.Main` |
| lsp | Liskov Substitution | `java -cp out lsp.Main` |
| isp | Interface Segregation | `java -cp out isp.Main` |
| dip | Dependency Inversion | `java -cp out dip.Main` |

Compilar: `javac -encoding UTF-8 -d out $(find src -name "*.java")`
