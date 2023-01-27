# MS_DSL

## Aufgabe 1 - Interne DSL

Hier habe ich ein kleines Beispiel zu Audiobooks gebastelt. 

## Aufgabe 2 - Externe DSL

Ich habe hier zuerst versucht die vorgeschlagenen Werkzeuge auf meinem Windows-Rechner zum Laufen zu bekommen. Das hat allerdings nur bei MPS funktioniert. Hier hatte ich mich ein wenig mit dem Taschenrechner-Beispiel beschäftigt und festgestellt, dass MPS doch sehr "kompliziert" ist. 

Letztendlich habe ich ein kleines Beispiel zu IP-Adressen auf einer Linux-VM mit ANTLR gebastelt, welches ipv4-Adressen prüft. 

Neben der Installation der notwendigen Pakete, war es notwendig die folgenden Werte in der `.bashrc` meines Linux Nutzers zu setzen, um die Befehle komfortabel ausführen zu können.

```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH"
export PATH="~/.local/bin/:$PATH"
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```
