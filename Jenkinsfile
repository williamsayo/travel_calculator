pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    environment {
        GIT_REPOSITORY = ''
        DOCKER_CREDENTIALS = 'docker_cred'
        DOCKER_REPOSITORY = 'williamsayo/travelcalculator'
        DOCKER_TAG = 'latest'
    }
    stages {
       stage('Checkout') {
            steps {
                git '${REPOSITORY}'
            }
       }

       stage('build') {
           steps {
               bat 'mvn clean install'
           }
       }
       stage('build') {
          steps {
              bat 'mvn clean install'
          }
      }
       stage('test') {
         steps {
             bat 'mvn test'
         }
      }
      stage('publish report') {
         steps {
              bat 'mvn jacoco:report'
         }
      }

      stage('build docker image') {
          steps {
                script {
                    docker.build('${DOCKER_REPOSITORY}:${DOCKER_TAG}')
                }
            }
          }
      }
      stage('publish docker image') {
          steps {
                script {
                    docker.withCredentials('https://index.docker.io/v1/','${DOCKER_CREDENTIALS}') {
                        docker.build('${DOCKER_REPOSITORY}:${DOCKER_TAG}').push()
                    }
                }
          }
      }
}