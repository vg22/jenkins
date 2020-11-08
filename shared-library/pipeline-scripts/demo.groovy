@Library("shared-library1.0") _
    pipeline {
        agent {
            node {
                label 'master'
        }
    }

    stages {
        stage('get build number') {
            steps {
                script {
                    log.info "hello world"
                }
            }
        }
}
}

