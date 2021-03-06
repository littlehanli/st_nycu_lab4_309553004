# NYCU Software Testing Lab4 - CI/CD with Github Actions
[![Java CI with Gradle](https://github.com/littlehanli/st_nycu_lab4_309553004/actions/workflows/gradle.yml/badge.svg)](https://github.com/littlehanli/st_nycu_lab4_309553004/actions/workflows/gradle.yml)


>Create a rock-paper-scissors game and build with Github Actions


## Details

* Part 1 - Write a rock-paper-scissors game with JAVA
    * **Main.java**: Call the function in Game() class
    * **Game.java**: Responsible for game logic

* Part 2 - Write a rock-paper-scissors game unit test
    * Test for Game() class
    * Test condition:
        *  all win cases
        *  all lose cases
        *  all draw cases
        *  valid/invalid input cases

* Part 3 - Use github action to compile, test, assemble JAR file
    * Write Github Action (gradle.yml)
        * Compile: gradle compileTestJava
        
        ![image](https://imgur.com/0A4BlBC.png)
        
        * Test: gradle test
        
        ![image](https://imgur.com/ZOJiT89.png)
        
        * Assemble: gradle assemble
        
        ![image](https://imgur.com/WcWV79h.png)
    
    * When there is a new commit and push, execute three jobs:
        * **Compile**, **Test**, and **Assemble** (need to be executed in order)
        
        ![image](https://imgur.com/N6hoAtj.png)
    
    * Storing workflow "all test report directory", "assemble jar file" as workflow [artifacts](https://github.com/actions/upload-artifact)
        * Upload **jar file** and **testReport** to github workflow artifacts
        
        ![image](https://imgur.com/wk0G0Hf.png)
    
    * Add github action badge to README

* Part 4 - Use github action to automate release jar file when push is a tag pushed events
    * Create a new job named **Release**
    * **Release** will be execute only when **Git tag push**
    * Add assemble jar file to Github release through **[action-gh-release](https://github.com/softprops/action-gh-release)**

      ![image](https://imgur.com/ZHYOPhw.png)
      ![image](https://imgur.com/b6F9spL.png)
      ![image](https://imgur.com/kYdtcNN.png)


* Bonus - Use action/cache to cache your dependencies and speed up your build time.
    * Independent environment of each job
    * The problems of huge project and huge dependencies
    * Try to use action/cache to cache your dependencies for each workflow

