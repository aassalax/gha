### GHA project

Résumé du scénario demandé
🔁 Sur chaque push

    ✅ Build + Test (sauf main car job fait par un autre workflow)

🔀 Sur chaque PR mergée vers main

    ✅ Build + Test

    ✅ Deploy vers DEV / TEST

    ✅ Si label release → créer un tag SemVer et une GitHub Release (basée sur la version définie dans Gradle)

🚀 Sur chaque release GitHub

    ✅ Déploiement vers PROD