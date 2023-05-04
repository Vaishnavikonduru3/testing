def gitUtils = load 'git.groovy'

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                gitUtils.checkoutGitRepo(branch: 'master', repoUrl: 'https://github.com/your-repo.git', credentialsId: 'your-credential-id')
            }
        }

        // Add more stages here that use the gitUtils functions
    }
}
