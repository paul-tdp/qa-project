pipeline {
    agent any

    stages {
        stage('Testing Environment') {
            steps {
                    echo "testing"
                   
                }
            }
        stage('Build') {
            steps {
                sh 'mvn package -DskipTests'
                sh 'docker build -t="paulgirtavic/qa-project:latest" .'
                }
            }
        stage('Deploy') {
            steps {
                sh 'docker push paulgirtavic/qaproject:latest'
            }
        }
    }
}
