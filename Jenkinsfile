pipeline {
	agent { docker { image 'maven:3.9.6-eclipse-temurin-17-alpine'}}
	stages {
		stage('build'){
			steps {
				sh 'mvn --version'
			}
		}
	}
    	post {
        	always {
            		echo 'This will always run'
        	}
        	success {
            		echo 'This will run only if successful'
        	}
        	failure {
        	    echo 'This will run only if failed'
        	}
        	unstable {
        	    echo 'This will run only if the run was marked as unstable'
        	}
        	changed {
        	    echo 'This will run only if the state of the Pipeline has changed'
        	    echo 'For example, if the Pipeline was previously failing but is now successful'
        	}
    	}
}