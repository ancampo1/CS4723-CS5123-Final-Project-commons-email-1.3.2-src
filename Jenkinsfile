pipeline{
    agent any

    stages{
        stage('Build Stage'){
            steps{
                withMaven(maven : 'maven_3_6_3'){
                    bat 'mvn -B -DskipTests clean package'
                }
            }
        }

        stage ('Test Stage')
        {
            steps {
                withMaven (maven : 'maven_3_6_3'){
                    bat 'mvn test'
                }
            }
        }

        stage('Deliver Stage')
        {
            steps{
                withMaven (maven : 'maven_3_6_3')
                {
                    bat 'echo "kxm___"'
                }
            }

        }

    }
}