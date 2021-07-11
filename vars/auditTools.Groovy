def call() {
    node {
        sh '''
            git version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }
}
