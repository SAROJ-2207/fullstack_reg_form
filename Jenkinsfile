pipeline{
agent any
tools{
 jdk'JAVA_HOME'
 maven 'M2_HOME'
 }
  stages{
    stage("checkout"){
	   steps{
	      git branch: 'main', url: 'https://github.com/SAROJ-2207/fullstack_reg_form.git'
			}
		}
	stage("maven build"){
	   steps{
	     sh 'mvn clean package'
			}
		}	
	stage("Docker Check"){
	   steps{
			sh 'whoami'
			sh 'groups'
			sh 'docker ps'
			}
		}
	  stage("Build docker image"){
	   steps{
			script{
				sh 'docker ps'
				sh 'docker build -t saroj2207/user_reg_image .'
			  }
			}
		}	
	}
}
