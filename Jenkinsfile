pipeline{
    agent any

    stages{
        stage('Build Stage'){
            steps{
                withMaven(maven : 'maven_3_6_3'){
                    sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        stage ('Test Stage')
        {
            steps {
                withMaven (maven : 'maven_3_6_3'){
                    sh 'mvn test'
                }
            }
        }

        stage('Deliver Stage')
        {
           withMaven (maven : 'maven_3_6_3')
           {
                sh 'script.bash'
            }
        }

    }
}