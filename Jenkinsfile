def gitUtils = load 'sharedlibrary/git.groovy'

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                
                gitUtils.checkoutGitRepo(branch: 'main', repoUrl: 'https://github.com/Vaishnavikonduru3/testing.git', credentialsId: 'personaluse')
            }
        }

        // Add more stages here that use the gitUtils functions
    }
}
