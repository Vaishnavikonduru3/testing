def checkoutGitRepo(String repoUrl, String branch, String credentialsId) {
    git branch: branch,
        credentialsId: credentialsId,
        url: repoUrl
}

def gitCheckout(String branch) {
    bat "git checkout ${branch}"
}

def gitFetch(String remote) {
    bat "git fetch ${remote}"
}

def gitPull(String remote, String branch) {
    bat "git pull ${remote} ${branch}"
}

def gitPush(String remote, String branch) {
    bat "git pubat ${remote} ${branch}"
}

def gitAddAll() {
    bat 'git add .'
}

def gitCommit(String message) {
    bat "git commit -m '${message}'"
}

def gitTag(String tagName) {
    bat "git tag ${tagName}"
}

def gitPushTag(String tagName, String remote) {
    bat "git push ${remote} ${tagName}"
}

def gitMerge(String branch) {
    bat "git merge ${branch}"
}

return this
