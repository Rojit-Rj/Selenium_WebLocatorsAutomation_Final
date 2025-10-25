pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-repo-url.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                    archiveArtifacts 'extent-reports/**'
                }
            }
        }
    }
    post {
        success { echo 'Build and Tests Passed!' }
        failure { echo 'Build or Tests Failed!' }
    }
}
