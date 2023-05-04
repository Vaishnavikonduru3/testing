pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                    def gitUtils = load 'https://github.com/Vaishnavikonduru3/testing/blob/main/sharedlibrary/git.groovy'
                    gitUtils.gitCheckout(branch: 'main')
            }
        }
    }

    // Add more stages here that use the gitUtils functions
}

