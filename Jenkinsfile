pipeline {
    agent any
    
    tools {
        jdk 'JDK17'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/tatiana263/MiProyectoJenkins.git'
            }
        }
        
        stage('Compile') {
            steps {
                sh '''
                javac src/main/java/App.java -d target/classes
                javac -cp junit.jar src/test/java/AppTest.java -d target/test-classes
                '''
            }
        }
        
        stage('Test') {
            steps {
                sh 'java -cp junit.jar:target/classes:target/test-classes org.junit.runner.JUnitCore AppTest'
            }
            post {
                always {
                    junit '**/test-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                sh '''
                echo "Main-Class: App" > target/MANIFEST.MF
                jar cvfm app.jar target/MANIFEST.MF -C target/classes .
                '''
            }
        }
    }
    
    post {
        always {
            archiveArtifacts artifacts: '*.jar', fingerprint: true
        }
    }
}