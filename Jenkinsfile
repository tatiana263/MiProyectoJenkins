pipeline {
    agent any

    tools {
        jdk 'jdk-17'
         maven 'MAVEN_HOME'
    }

    stages {
        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}
