def gitUtils = load 'sharedlibrary/git.groovy'

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                
                gitUtils.gitCheckout(branch: 'main')
            }
        }

        // Add more stages here that use the gitUtils functions
    }
}
