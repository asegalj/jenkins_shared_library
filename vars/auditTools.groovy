#!groovy

def call() {
    node {
        echo 'test'
        sh '''
            git version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }
}

