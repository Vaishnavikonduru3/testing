pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                def gitUtils = load 'sharedlibrary/git.groovy'
                bat '''
                    git clone https://github.com/Vaishnavikonduru3/testing.git
                    cd sharedlibrary/groovy.git
                    gitUtils.gitCheckout(branch: 'main')
                '''
            }
        }

        // Add more stages here that use the gitUtils functions
    }
}
