## README - Application de Questionnaire
## Description du projet
- Cette application Android permet aux utilisateurs de répondre à un questionnaire sur le modèle MVC (Modèle-Vue-Contrôleur) et la syntaxe JSP. Les utilisateurs peuvent sélectionner plusieurs options à l'aide de cases à cocher et choisir une réponse à l'aide de boutons radio. Les résultats sont ensuite affichés sur une nouvelle activité.

## Fonctionnalités
- Questions à choix multiples : Les utilisateurs peuvent cocher plusieurs cases pour indiquer les significations du modèle MVC.
- Question avec réponse unique : Les utilisateurs choisissent une réponse OUI ou NON pour une question sur la syntaxe JSP.
- Navigation : Un bouton "Suivant" permet de passer à la page de résultats, et un bouton "Quitter" ferme l'application.
## Structure des fichiers
- MainActivity.java : Contrôle la logique de l'interface utilisateur, récupère les entrées des utilisateurs, et navigue vers la deuxième activité.
- activity_main.xml : Contient l'interface utilisateur pour les entrées du questionnaire, avec des CheckBox, des RadioButton, et des boutons.
- MainActivity2.java : Affiche les résultats du questionnaire en récupérant les données envoyées depuis MainActivity.
- activity_main2.xml : Contient l'interface utilisateur pour afficher les résultats.
## Installation et utilisation
- Cloner le projet : Clonez ou téléchargez ce projet depuis le dépôt GitHub.
- Ouvrir le projet dans Android Studio.
- Exécuter l'application : Sur un appareil Android ou un émulateur.
- Utiliser l'application :
  - Répondez aux questions en cochant les cases appropriées et en sélectionnant une réponse.
  - Cliquez sur le bouton Suivant pour voir les résultats.
  - Cliquez sur le bouton Quitter pour fermer l'application.
## Technologies utilisées
- Langage : Java
- IDE : Android Studio
- Layout : LinearLayout pour l'interface utilisateur
## Demonstration en video 
- https://github.com/user-attachments/assets/85092334-f6ae-48b2-9748-ea5197a4274d
## Auteur
- Assia BOUJNAH
