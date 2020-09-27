pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'Maven Test, Compile and Packaging using jenkinsfile .' 

            }
        }
        stage('Compile') { 
            steps { 
               bat 'mvn compile'
            }
		}
		stage('Test') {
            steps {
                bat 'mvn test'
            }
        }		
		stage('Install') {
            steps {
                bat 'mvn install'
            }
        }
    }
}