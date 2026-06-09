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
	}
}