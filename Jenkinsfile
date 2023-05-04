def gitUtils = load 'https://github.com/Vaishnavikonduru3/testing/blob/9b2916100a033bfcff0f152f1680d9d8b0962b2f/git.groovy'

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
