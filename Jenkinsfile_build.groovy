//delcarative pipeline
pipeline {
    agent any 
    stages {
        stage("stage-1") {
            steps {
                sh "ls -l"
            }
        }
        stage("stage-2") {
            steps {
                sh "mvn clean package"
                sh "echo "small commit 11231sewerw22 1""
            }
        } tar 
    }
}