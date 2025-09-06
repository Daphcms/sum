
pipeline {
    agent any

    stages {
        stage('Inicia programa') {
            steps {
                echo 'clonar repo'
            }
        }
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Daphcms/sum.git'
            }
        }
         stage('Compile Java') {
            steps {
                script {
                    bat "javac ParametrosSuma.java" 
                }
                script {
                    bat "java Suma" 
                }
            }
        }
    }
}