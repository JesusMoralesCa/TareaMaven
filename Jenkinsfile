pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            steps{
                withMaven(maven: 'maven3_8_1'){
                 checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/JesusMoralesCa/TareaMaven.git']])
                }
            }
        }

        stage('Build') {
            steps{
            withMaven(maven: 'maven3_8_1') {
                sh 'mvn clean package'
            }
            }
        }

        stage('Test') {
            steps{
            withMaven(maven: 'maven3_8_1') {
                sh 'mvn test'
            }
            }
        }
    }
}
