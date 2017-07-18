pipeline {
  agent {
    docker {
      image 'maven'
    }
    
  }
  stages {
    stage('error') {
      steps {
        sh 'mvn package'
      }
    }
  }
}