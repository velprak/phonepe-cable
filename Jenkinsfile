pipeline{
    agent any{
        stages{
            stage('githubcode checkout'){
                steps{
                    git credentialsId: 'git', url: 'https://github.com/velprak/phonepe-cable.git'
                }
                stage('clean install'){
                    steps{
                        sh 'mvn clean install'
                    }
                }
                }
            }
        }
        }
    }
}
