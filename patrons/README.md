# INF4067 - Patterns de Construction & Structuration
Projet implémentant les patterns de construction en Java.
- Factory Method
- Singleton
- Builder
- Prototype
Projet implémentant les patterns de Structuration en Java.
- Adapter
- Composite

# INF4067_Patterns_Construction & Structuration


---


## 1. Organisation du projet


INF4067_Patterns_Construction/
├── docs
│   └── diagrams_construction-patterns
│   │   ├── Builder Pattern.png
│   │   ├── Factory Method.png
│   │   ├── Prototype Pattern.png
│   │   └── Singleton.png
│   └── diagrams_structuration_patterns
│       ├── adapter_class_diagram.png
│       ├── adapter_sequence_diagram.png
│       ├── composite_class_diagram.png
│       └── composite_sequence_diagram.png
├── src
│   ├── adapter
│   ├── composite
│   ├── builder
│   ├── factory
│   ├── prototype
│   └── singleton
└── README.md


## 2. Compilation et exécution

### 2.1 Prérequis

* Java JDK 8 ou supérieur
* Accès aux commandes `javac` et `java`

Vérification :

```bash
java -version
javac -version
```

---

### 2.2 Positionnement

Se placer dans le dossier `src` du projet :

```bash
cd INF4067_Patterns_Construction/src
```

---

### 2.3 Compilation et exécution – Adapter

Compilation :

```bash
javac adapter/*.java
```

Exécution :

```bash
java adapter.Client
```


### 2.4 Compilation et exécution – Composite

Compilation :

```bash
javac composite/*.java
```

Exécution :

```bash
java composite.Client
```

Résultat attendu :



### 2.5 Compilation globale

```bash
javac adapter/*.java composite/*.java
```





