@Library("variablesGroovy") _

pipeline {
    agent any
   /*
    stages {
        stage('Checkout') {
            steps{
                script{
                    sh 
                } 
            }
        }
*/
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
