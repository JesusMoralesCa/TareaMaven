@Library("variablesGroovy") _

pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            steps{
                script{
                    variables.check
                } 
            }
        }

        stage('Build') {
            steps{
            
                script{
                    variables.crPackage
                } 
            
            }
        }

        stage('Test') {
            steps{
            
                script{
                    variables.testUni
                } 
            
            }
        }
    }
}
