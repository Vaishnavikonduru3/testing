def gitUtils = load 'https://github.com/Vaishnavikonduru3/testing/blob/9b2916100a033bfcff0f152f1680d9d8b0962b2f/git.groovy'

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
