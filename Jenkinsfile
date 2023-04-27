pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            
                withMaven(maven: 'maven3_8_1'){
                 checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/JesusMoralesCa/TareaMaven.git']])
                }
            
        }

        stage('Build') {
            withMaven(maven: 'maven3_8_1') {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            withMaven(maven: 'maven3_8_1') {
                sh 'mvn test'
            }
        }
    }
}
