### GHA project

Résumé du scénario demandé
🔁 Sur chaque push

    ✅ Build + Test

🔀 Sur chaque PR mergée vers main

    ✅ Build + Test

    ✅ Deploy vers DEV / TEST

    ✅ Si label release → créer un tag SemVer et une GitHub Release (basée sur la version définie dans Gradle)

🚀 Sur chaque release GitHub

    ✅ Déploiement vers PROD