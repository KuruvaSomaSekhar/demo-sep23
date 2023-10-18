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
                sh "echo "small commit 1123423423343231sewerw22 1""
            }
        } tar 
    }
}