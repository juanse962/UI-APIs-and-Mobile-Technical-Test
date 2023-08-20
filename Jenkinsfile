pipeline {
    agent any

    environment {
        GRADLE_HOME = tool 'Gradle'
        PATH = "${GRADLE_HOME}/bin:${PATH}"
        GIT_REPO_URL = 'https://github.com/juanse962/UI-APIs-and-Mobile-Technical-Test.git' // Replace with your actual Git repository URL
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from the specified Git repository
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], userRemoteConfigs: [[url: "${GIT_REPO_URL}"]]])
            }
        }

        stage('Build') {
            steps {
                script {
                    dir('ui-choucair') {
                    // Install Gradle wrapper if not already present
                    sh './gradlew wrapper --gradle-version=<your_gradle_version>'

                    // Build your Gradle project
                    sh './gradlew clean build'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run your Serenity BDD tests
                    sh './gradlew clean test aggregate'
                }
            }
        }

        stage('Publish Reports') {
            steps {
                // Publish Serenity BDD test reports
                publishHTML(target: [allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'target/site/serenity', reportFiles: 'index.html', reportName: 'Serenity BDD Report'])
            }
        }

        // Add more stages for deployment, if needed
    }

    post {
        always {
            // Archive artifacts for storage or deployment
            archiveArtifacts artifacts: '**/build/libs/*.jar', allowEmptyArchive: true
        }
    }
}