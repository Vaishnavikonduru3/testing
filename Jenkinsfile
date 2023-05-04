pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
               
                    def gitUtils = load 'sharedlibrary/git.groovy'
                    gitUtils.gitCheckout(branch: 'main')
            }
        }
    }

    // Add more stages here that use the gitUtils functions
}

