pipeline {

  agent any
  tools {
        maven 'M3'
   }
  stages {
        stage ('Checkout') {
            steps {
                checkout scm
             }
        }
        stage ('Build') {
            steps {            
              sh "mvn  clean install -DskipTests=true"
            }
        }
         stage ('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage ('Build Docker Image') {
            steps {
                sh "docker version"
                sh "docker build -t barathece91/demo-jenkins ."
            }
        }
        
        stage ('Deploy Docker Image') {
            steps {             
                sh "docker run --name demo-jenkins -p 8081:8080 barathece91/demo-jenkins "
            }
        }
    }

}
