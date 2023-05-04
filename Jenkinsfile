pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                bat '''
                    git clone https://github.com/Vaishnavikonduru3/testing.git
                    cd sharedlibrary/groovy.git
                    gitUtils.gitCheckout(branch: 'main')
                '''
            }
        }
    }
    
    // Load the shared library outside of the stages block
    def gitUtils = load 'sharedlibrary/git.groovy'

    // Add more stages here that use the gitUtils functions
}
