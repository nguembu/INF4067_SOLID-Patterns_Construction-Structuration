📚 INF4067 - TD1: Principes SOLID
Université de Yaoundé I - Département d'Informatique
Master 1 - INF4067 : UML et Design Patterns - 2025-2026

📖 Description
Ce projet implémente les 5 principes SOLID de conception orientée objet avec des exemples concrets montrant les violations de chaque principe et leurs corrections respectives.

🎯 Objectifs
Comprendre et appliquer les principes SOLID

Identifier les violations de bonnes pratiques de conception

Refactoriser du code pour le rendre plus maintenable et extensible

Produire des diagrammes UML avant/après refactoring

🏗️ Structure du Projet
text
INF4067_TD1_SOLID/
│
├── SRP/                          # Single Responsibility Principle
│   ├── avant/                   # Version violant le principe
│   │   ├── Book.java
│   │   ├── Main.java
│   │   └── UML_avant.png
│   └── apres/                   # Version respectant le principe
│       ├── BookSRP.java
│       ├── BookPrinter.java
│       ├── BookSaver.java
│       ├── BookBusinessLogic.java
│       ├── Main.java
│       └── UML_apres.png
│
├── OCP/                          # Open/Closed Principle
│   ├── avant/
│   └── apres/
│
├── LSP/                          # Liskov Substitution Principle
│   ├── avant/
│   └── apres/
│
├── ISP/                          # Interface Segregation Principle
│   ├── avant/
│   └── apres/
│
├── DIP/                          # Dependency Inversion Principle
│   ├── avant/
│   └── apres/
│
│
└── docs/                         # Documentation supplémentaire
    ├── rapport.pdf
    └── diagrammes/
    
📋 Les 5 Principes SOLID Implémentés
1. SRP - Single Responsibility Principle
Problème : Une classe Book qui gère trop de responsabilités (données, affichage, persistance, logique métier)
Solution : Séparation en 4 classes spécialisées

2. OCP - Open/Closed Principle
Problème : Classe AreaCalculator qui doit être modifiée pour ajouter de nouvelles formes
Solution : Interface Shape permettant l'extension sans modification

3. LSP - Liskov Substitution Principle
Problème : La classe Square ne peut pas substituer Rectangle sans changer le comportement
Solution : Interface commune Shape avec implémentations indépendantes

4. ISP - Interface Segregation Principle
Problème : Interface Worker trop large forçant RobotWorker à implémenter eat()
Solution : Interfaces séparées Workable et Eatable

5. DIP - Dependency Inversion Principle
Problème : OrderProcessor dépend directement de MySQLDatabase
Solution : Injection de dépendance via interface Database