node{ 
    stage('githubcode checkout'){
    git credentialsId: 'git', url: 'https://github.com/velprak/phonepe-cable.git'
    }
    stage('clean install'){
       sh 'mvn clean install'
    }
}
