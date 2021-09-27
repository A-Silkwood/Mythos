<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://minecraft-heads.com/media/k2/items/cache/462ad80c2a24c1c5e9280ab7506654ea_M.jpg" alt="Project logo"></a>
</p>

<h3 align="center">Mythos</h3>

---

<p align="center"> The Gods of Minecraft have taken notice of the mortal inhabitants.
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Building and Distrubtion](#building_and_distrubtion)
- [Testing](#testing)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>

This is Minecraft Forge mod that is currently in early development. The idea is to add gods to the game that player will be able to gain rewards from as well as battle.

## 🏁 Getting Started <a name = "getting_started"></a>

Follow the instructions below on how to setup a development environment on your own machine. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites

- **IDE**
- **Gradle** support in your IDE

**Recommended IDEs:**
- Eclipse
- IntelliJ IDEA
- VSCode

Forge only explicitly supports Eclipse but the other two IDEs should work fine without any issues.

### Setting Up Environment

1. Clone this repo
2. Open the project's root folder
2. Run Gradle. This depends on your IDE
    - **Eclipse**
        1. Run `gradlew genEclipseRuns` if you are on Windows or `./gradlew genEclipseRuns` if you are on Mac/Linux
        2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `./gradlew eclipse` to generate the project.
    - **IntelliJ IDEA**
        1. Select your build.gradle file and have it import.
        2. Run `gradlew genIntellijRuns` if you are on Windows or `./gradlew genIntellijRuns` if you are on Mac/Linux
        3. Refresh the Gradle Project in IDEA if required.
    - **VSCode**
        1. Run `gradlew genVSCodeRuns` if you are on Windows or `./gradlew genVSCodeRuns` if you are on Mac/Linux

This should have generated even more folders and files that will be needed for development and building the project


## 🚀 Building and Distrubtion <a name = "building_and_distrubtion"></a>

To build the mod run `gradlew build` for Windows or `./gradlew build` if you are on Mac/Linux
This will output a file in `build/libs` with the name [archivesBaseName]-[version].jar. This file can be placed in the mods folder of a Forge enabled Minecraft setup or distributed.

`archivesBaseName` and `version` can be found in `build.gradle`

## 🔧 Testing <a name = "testing"></a>

1. Build the mod using the command in the above section.
2. You can then run `gradlew runClient` if you are on Windows or `./gradlew runClient` if you are on Mac/Linux.
    - This will run a Minecraft client from your `<runDir>` with all mods in this project included.
3. You can also run a dedicated server using the server run config or via `gradlew runServer` if you are on Windows or `./gradlew runServer` if you are on Mac/Linux. This will launch the Minecraft server with its GUI. After the first run, the server will shut down immediately until the Minecraft EULA is accepted by editing `run/eula.txt`. Once accepted, the server will load and can be accessed via a direct connect to `localhost`.

## ⛏️ Built Using <a name = "built_using"></a>

Links below go directly to documentation

- [Forge](https://mcforge.readthedocs.io/en/1.17.x/) - Modding API

## ✍️ Authors <a name = "authors"></a>

- [@A-Silkwood](https://github.com/A-Silkwood) - Programmer
- Alex Tamiko - Man with ridiculous last name
- James Garrard - Sean's brother

## 🎉 Acknowledgements <a name = "acknowledgement"></a>

- Sean Garrard - Jame's Brother
