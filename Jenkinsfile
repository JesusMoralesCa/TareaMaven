@Library('java-node') _
pipeline {
    agent {
        label('master')
    }
    tools {
        maven 'maven'
    }
    environment{
        DOCKERHUB_CREDENTIALS = credentials('docker-hub-jesusmoralesc')
        
    }
    
   stages {
        stage('Read properties and checkout') {
            steps {
                script {
                    def file = readProperties file: 'project.properties'
                    env.image = file['imageName']
                    
                }
            }
        }

 stage('Test') {
            steps {
                  MavenCleanPackage()
                  MavenTest()
            }
        }

        stage('Build') {
            steps {
                  DockerBuild()
            }
        }
    
    
stage('Deploy') {
            steps {
                  DockerHubLogin()
                  DockerPush()
            }
        }
    }
       
    
    post {
        always {
            sh 'docker logout'
        }
    }
}
