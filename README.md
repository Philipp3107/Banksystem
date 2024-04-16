# Banksystem
Banksystem als Übung

## Das erstellen eines lokalen Repos

Zuerst wird ein Ordner benötigt.

1. Innerhalb dieses Ordners wird der command `git init` ausgeführt.

3. Die url aus dem Repo wird kopiert und mit folgendem Command als remote hinzugefügt <br>
    `git remote add origin <remote-url>`
4. Der aktuelle Stand des Repos wird gepullt: `git pull origin main`

## Arbeiten am remote Repo

Für ein neues Feature soll ein neuer Branch angelegt werden.

`git checkout -b <feature_branch_name>`

Nach dem Arbeiten auf dem Branch Änderungen committen.

`git commit -m "<commit_message>`

Damit der Branch nicht nur auf dem lokalen Repository verfügbar ist, muss dieser aufs Remote-Repository gepusht werden:

`git push -u origin <feature_branch_name>`

Um sich auf den finalen Pull-Request vorzubereiten müssen alle Updates des remote dev-Branches auf den lokalen Feature-Branch gepullt werden.

`git pull origin dev`

Nun kann eine Pull-Request, um den Feature-Branch auf den dev-Branch zu ziehen, erstellt werden. Andere Teammitglieder schauen sich diese Pull-Request (Review) an und geben dazu Feedback. Ist das Einverständnis des Teams da, kann die Pull-Request durchgeführt werden.

Nun sollte der lokale dev-Branch geupdatet werden. Man wechsle auf den Main Branch und pullt.

git checkout dev
git pull
Schlussendlich sollte der Feature-Branch lokal sowie remote gelöscht werden, falls dieser nicht mehr benötigt wird.

`git branch -D <feature_branch_name>`
