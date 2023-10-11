pipeline{
    agent any
    tools{
        maven "3.9.4"
    }
    environment{
        PATH = "C:/Windows/system32"
    }
    stages{
        stage("git"){
            steps{
                git 'https://github.com/SaulColin9/BookStore-Pipeline.git'
            }
        }
        stage("build"){
            steps{
                bat "mvn clean install"
            }
        } 
        stage("SonarQube Analysis"){
            steps{
                script{
                    def scannerHome = tool 'sonarScanner5.0.1'    
                }
                withSonarQubeEnv('sonarqube') {
                    bat "C:/Users/saul_colin/Documents/SonarScanner/sonar-scanner-cli-5.0.1.3006-windows/sonar-scanner-5.0.1.3006-windows/bin/sonar-scanner -Dsonar.projectKey=task-one -Dsonar.projectName=task-one -Dsonar.java.binaries=C:/ProgramData/Jenkins/.jenkins/workspace/$JOB_NAME/src/main/java/com/bookstore/BookStoreApp"
                    
                }
            }
        }
        stage("Deploy to Tomcat"){
            steps{
                deploy adapters: [tomcat9(credentialsId: '2d518a95-3aa9-4505-a79c-b4839ff4a1c2', path: '', url: 'http://localhost:8083/')], contextPath: null, war: '**/*.war'
            }
        }
    }
}
